# Implementation Plan - Authentication Transaction Manager (AUTH-TXN-001)

Implement a robust `AuthenticationTransactionManager` to guarantee atomic authentication transactions and prevent race conditions with concurrent platform services.

## User Review Required

> [!IMPORTANT]
> This change introduces a new `AuthenticationTransactionManager` that will orchestrate the entire login flow, superseding basic login implementations in `AuthRepositoryImpl`.

## Proposed Changes

### Core Transaction Logic

#### [NEW] [AuthTransactionState.kt](file:///home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/auth/transaction/AuthTransactionState.kt)
Define the 14 states required for the transactional state machine:
`IDLE`, `LOGIN_PAGE_LOADING`, `LOGIN_PAGE_READY`, `AUTHENTICATING`, `LOGIN_REQUEST_SENT`, `LOGIN_RESPONSE_RECEIVED`, `COOKIE_CAPTURE`, `COOKIE_PERSISTED`, `SESSION_CREATING`, `SESSION_CREATED`, `SESSION_VALIDATING`, `PORTAL_VALIDATING`, `AUTHENTICATED`, `FAILED`.

#### [NEW] [AuthenticationTransactionManager.kt](file:///home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/auth/transaction/AuthenticationTransactionManager.kt)
The central orchestrator for authentication transactions.
- Implements `AUTH_TRANSACTION_LOCK` by coordinating service suspension.
- Manages the state machine.
- Orchestrates the login process step-by-step as defined in the JSON spec.
- Handles success/failure conditions and portal validation rules.

### Service Updates for Suspension Support

#### [MODIFY] [ICookieManager.kt](file:///home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/contracts/cookie/ICookieManager.kt) & [CookieManager.kt](file:///home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/manager/CookieManager.kt)
Add `setTransactionLock(locked: Boolean)` to restrict `delete` and `validation` operations during authentication.

#### [MODIFY] [ISessionValidator.kt](file:///home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/contracts/session/ISessionValidator.kt) & [SessionValidator.kt](file:///home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/session/validation/SessionValidator.kt)
Add `setEnabled(enabled: Boolean)` to pause session validation during the transaction.

#### [MODIFY] [ISessionRecoveryManager.kt](file:///home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/contracts/session/ISessionRecoveryManager.kt) & [SessionRecoveryManager.kt](file:///home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/session/recovery/SessionRecoveryManager.kt)
Add `setEnabled(enabled: Boolean)` to prevent session recovery attempts during authentication.

#### [MODIFY] [PlatformVerifier.kt](file:///home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/bootstrap/PlatformVerifier.kt)
Update to wait for the `AUTHENTICATED` transaction state before running the full stack verification.

#### [MODIFY] [IDashboardRenderManager.kt](file:///home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/contracts/ui/IDashboardRenderManager.kt) & [DashboardRenderManager.kt](file:///home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/manager/ui/DashboardRenderManager.kt)
Add `setEnabled(enabled: Boolean)` to prevent dashboard rendering until authentication is fully completed.

### Event Bus Enhancements

#### [MODIFY] [EventBus.kt](file:///home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/bootstrap/EventBus.kt)
Implement event queuing logic to buffer specific events (like `SessionValidationStarted`) during the transaction and release them once `AUTHENTICATED` is reached.

### Integration

#### [MODIFY] [AuthRepositoryImpl.kt](file:///home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/data/repository/AuthRepositoryImpl.kt)
Refactor `login()` to use `AuthenticationTransactionManager`.

#### [MODIFY] [AuthCoreModule.kt](file:///home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/di/AuthCoreModule.kt)
Wire the new `AuthenticationTransactionManager` into the Hilt dependency graph.

## Verification Plan

### Automated Tests
- Unit tests for `AuthenticationTransactionManager` verifying state transitions.
- Unit tests for `EventBus` verifying event queuing during "active transaction" state.
- Integration tests verifying that `SessionValidator` and `SessionRecoveryManager` are correctly paused/resumed.

### Manual Verification
- Deploy to device/emulator.
- Perform login and observe Logcat for transaction timeline and service pause/resume logs.
- Verify that no cookies are deleted during the login process.
- Verify that the dashboard launches only after the transaction is fully complete.
