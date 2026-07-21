# Task Context: SESSION-002 Session Validator Implementation

Session ID: 2026-07-18-session-002-implementation
Created: 2026-07-18T00:00:00Z
Status: in_progress

## Current Request
Implement SESSION-002: Session Validator - continuous validation engine for authenticated sessions.

## Decisions (from user approval)
- Validation Schedule: Hybrid Continuous (60s foreground, 300s background)
- HMAC Verification: SessionManager generates HMAC on create/refresh, SessionValidator verifies
- Device Binding: Verify stored device ID against device fingerprint

## Context Files (Standards to Follow)
- /home/darkage/Desktop/mku/.opencode/context/core/standards/code-quality.md
- /home/darkage/Desktop/mku/.opencode/context/core/standards/kotlin-standards.md

## Reference Files (Source Material)
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/manager/SessionManager.kt - SESSION-001 (needs HMAC updates)
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/contracts/crypto/ICryptoManager.kt - HMAC operations
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/contracts/security/ISecurityMonitor.kt - Security checks
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/auth/state/AuthenticationStateManager.kt - FSM pattern reference
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/auth/events/AuthenticationEventManager.kt - Event publishing pattern
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/di/AuthCoreModule.kt - DI registration pattern

## Components
1. SessionValidationResult (8 result types)
2. SessionValidatorMetrics
3. ISessionValidator (10 methods)
4. BootstrapEvent validation events (9 events)
5. SessionValidator (continuous validation)
6. SessionIntegrityChecker (HMAC verification)
7. SessionValidatorMetricsImpl
8. AuthCoreModule DI update

## Pre-Implementation (SESSION-001 Update Required)
- SessionManager.createSession() must generate HMAC
- SessionManager.refreshSession() must regenerate HMAC
- Session data must include deviceId binding

## Implementation Batches
- Batch 1: Contracts & Types (01-04) - PARALLEL
- Batch 2: Implementation (05-07) - PARALLEL
- Batch 3: DI Registration (08) - SEQUENTIAL

## Exit Criteria
- [ ] Build succeeds with no errors
- [ ] SessionValidationResult has 8 result types
- [ ] ISessionValidator has 10 methods
- [ ] 9 validation events in BootstrapEvent
- [ ] Continuous validation adapts to foreground/background
- [ ] HMAC generated on session create/refresh
- [ ] HMAC verified on every validation
- [ ] Device binding verified on validation
- [ ] DI registration at startupOrder: 21
- [ ] SessionValidatorReady event published