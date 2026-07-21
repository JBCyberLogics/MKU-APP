# Task Context: SESSION-001 Session Manager Implementation

Session ID: 2026-07-18-session-001-implementation
Created: 2026-07-18T00:00:00Z
Status: in_progress

## Current Request
Implement SESSION-001: Session Manager - a production-ready session lifecycle manager for MKU Student Portal authentication.

## Decisions (from user approval)
- Session timeout: 30 minutes (1800000ms)
- Automatic refresh: enabled, refresh 5 minutes before expiry
- Duplicate session handling: graceful replacement (terminate existing, create new)
- Legacy SessionManager: full replacement

## Context Files (Standards to Follow)
- /home/darkage/Desktop/mku/.opencode/context/core/standards/code-quality.md
- /home/darkage/Desktop/mku/.opencode/context/core/standards/kotlin-standards.md

## Reference Files (Source Material)
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/auth/state/AuthenticationStateManager.kt - FSM pattern reference
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/auth/events/AuthenticationEventManager.kt - Event publishing pattern
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/contracts/storage/StorageDomain.kt - SESSIONS domain
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/state/StateRegistry.kt - StateRegistry.updateSessionState()
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/registry/DependencyRegistry.kt - DI registration pattern
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/di/AuthCoreModule.kt - Existing DI providers

## Components
1. SessionState (12 states)
2. ISessionManager (extended interface)
3. Session model (enhanced)
4. BootstrapEvent session events (13 events)
5. SessionManager (FSM implementation)
6. SessionManagerMetrics
7. SessionTransition
8. AuthCoreModule DI update

## Implementation Batches
- Batch 1: Contracts & State (01-03)
- Batch 2: Events (04)
- Batch 3: Implementation (05-07)
- Batch 4: DI Registration (08)

## Exit Criteria
- [ ] Build succeeds with no errors
- [ ] All 12 SessionState values defined
- [ ] ISessionManager has 15 lifecycle methods
- [ ] 13 session events in BootstrapEvent
- [ ] SessionManager implements FSM with valid transitions
- [ ] Events published via IAuthenticationEventManager
- [ ] Session persisted to SESSIONS domain
- [ ] DI registration complete with startupOrder: 20