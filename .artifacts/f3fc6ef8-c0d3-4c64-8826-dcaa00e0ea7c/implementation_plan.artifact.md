# Implementation Plan - Platform Audit & Automatic Repair (PLATFORM-AUDIT-001)

Complete forensic audit and repair of the Authentication Platform to resolve architectural conflicts, race conditions, and initialization gaps.

## User Review Required

> [!CAUTION]
> This plan involves consolidating redundant registries (`ServiceRegistry` vs `DependencyRegistry`) and harmonizing the dual orchestration layers (`LoginOrchestrator` vs `AuthenticationTransactionManager`). This is a significant refactor but required for platform stability.

## Open Questions
- Should `LoginOrchestrator` be completely replaced by `AuthenticationTransactionManager`, or should it serve as a high-level UI-facing wrapper? *Decision: Merge high-level workflow logic into AuthenticationTransactionManager to ensure atomicity across all steps.*

## Proposed Changes

### 1. Registry Consolidation (CORE-005/CORE-007)
The current system has "Double Authority" with both `DependencyRegistry` and `ServiceRegistry`.

#### [MODIFY] [ServiceRegistry.kt](file:///home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/service/ServiceRegistry.kt)
- Convert to a simple lookup wrapper around `DependencyRegistry` if needed for backward compatibility, or prepare for removal.
- Remove redundant manual registration logic that happens after `BootstrapCompleted`.

#### [MODIFY] [DependencyRegistry.kt](file:///home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/registry/DependencyRegistry.kt)
- Ensure it remains the single source of truth for service instances during and after bootstrap.

---

### 2. Initialization Flow Repair (FINAL-001)
Fix the gaps in the `NetworkPlatformReady` and `CookiePlatformReady` chain.

#### [MODIFY] [NetworkManager.kt](file:///home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/manager/NetworkManager.kt)
- Publish `NetworkPlatformReady` only after successful initialization and internet check.
- Remove dependency on `ResponseProcessingManager` for this event.

#### [MODIFY] [ResponseProcessingManager.kt](file:///home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/manager/ResponseProcessingManager.kt)
- Remove `NetworkPlatformReady` publication. It should focus on response handling, not platform readiness.

---

### 3. Orchestration Harmonization (AUTH-002/AUTH-TXN-001)
Unify the workflow and transaction logic.

#### [MODIFY] [AuthenticationTransactionManager.kt](file:///home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/auth/transaction/AuthenticationTransactionManager.kt)
- Incorporate the 12-step high-level workflow from `LoginOrchestrator`.
- Add comprehensive error mapping.
- Ensure `AUTHENTICATED` state triggers immediate dashboard launch via `EventBus`.

#### [DELETE] [LoginOrchestrator.kt](file:///home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/auth/workflow/LoginOrchestrator.kt)
- Remove to prevent dual-execution and event collisions.

---

### 4. Direct Dashboard Launch & Navigation
Ensure the UI responds immediately to the `AUTHENTICATED` transaction state.

#### [MODIFY] [AuthViewModel.kt](file:///home/darkage/Desktop/mku/app/src/main/java/com/example/app/AuthViewModel.kt)
- Listen for `AuthTransactionState.AUTHENTICATED` (mapped via `BootstrapEvent`) to immediately set `isLoggedIn = true`.
- Ensure no intermediate "Success" screen blocks the dashboard transition.

#### [MODIFY] [DashboardRenderManager.kt](file:///home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/manager/ui/DashboardRenderManager.kt)
- Ensure it is ready to receive the `renderDashboard` call immediately after `AUTHENTICATED`.

---

### 5. Dependency Injection Cleanup

#### [MODIFY] [AuthCoreModule.kt](file:///home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/di/AuthCoreModule.kt)
- Remove `LoginOrchestrator` binding.
- Fix any remaining "Stub" or improper casts in `provideAuthRepository`.
- Ensure `AuthenticationTransactionManager` is properly injected everywhere.

## Verification Plan

### Automated Tests
- `gradle_build("app:assembleDebug")` to ensure DI and references are correct.
- Verify DAG topological sort in `DependencyRegistry` with a test case.

### Manual Verification
- Trace the login flow in Logcat:
    - Check for `Transaction Locked`.
    - Check for topological startup sequence.
    - Verify `NetworkPlatformReady` timing.
    - Confirm direct transition to `DashboardReady` without success screen delay.
