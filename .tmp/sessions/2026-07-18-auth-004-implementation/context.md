# Task Context: AUTH-004 Authentication Event Manager Implementation

Session ID: 2026-07-18-auth-004-implementation
Created: 2026-07-18T00:00:00Z
Status: in_progress

## Current Request
Implement AUTH-004 Authentication Event Manager per the AUTH-004 module specification. Centralized event management service responsible for publishing, subscribing, routing, validating, recording and distributing all authentication lifecycle events. Serves as the single event gateway for the Authentication Layer.

## Architecture Decisions (Pre-Approved)

### Decision: Event Routing (Option A - Gateway)
- AUTH-004 becomes the mandatory gateway for every authentication event
- Authentication modules shall NEVER publish directly to BootstrapEvent
- AuthenticationEventManager validates, records, enriches, and forwards events to BootstrapEvent
- BootstrapEvent is used as transport only (no business logic)

### Event Flow (8 steps):
1. Authentication module creates event
2. Event sent to AuthenticationEventManager
3. Validate event
4. Deduplicate event
5. Assign correlation identifier
6. Persist encrypted event history
7. Apply security validation
8. Publish through BootstrapEvent
9. Notify subscribers

### Component Changes Required:
- AuthenticationEngine: publish via AUTH-004 (NOT direct EventBus)
- LoginOrchestrator: publish via AUTH-004 (NOT direct EventBus)
- AuthenticationStateManager: publish via AUTH-004 (NOT direct EventBus)

## Context Files (Standards to Follow)
- /home/darkage/Desktop/mku/.opencode/context/core/standards/code-quality.md
- /home/darkage/Desktop/mku/.opencode/context/core/standards/kotlin-conventions.md (if exists)

## Reference Files (Source Material)
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/bootstrap/EventBus.kt - existing event bus
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/bootstrap/BootstrapEvent.kt - event types
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/auth/engine/AuthenticationEngine.kt - needs modification
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/auth/workflow/LoginOrchestrator.kt - needs modification
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/auth/state/AuthenticationStateManager.kt - needs modification
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/contracts/storage/ISecureStorageManager.kt - storage interface
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/contracts/storage/StorageDomain.kt - storage domains
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/security/monitor/SecurityMonitor.kt - security integration
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/di/AuthCoreModule.kt - DI patterns

## Components to Create
1. **IAuthenticationEventManager** - CORE-012 platform contract
2. **AuthenticationEventManager** - AUTH-004 implementation with event pipeline
3. **AUTH_EVENTS storage domain** - for event persistence
4. **Component modifications** - AuthEngine, LoginOrchestrator, AuthStateManager

## Constraints
- Single event gateway for all authentication events
- All AUTH events pass through AuthenticationEventManager
- No direct EventBus publishing from auth modules
- Events validated, deduplicated, persisted, security-checked before forwarding
- Correlation IDs assigned to all events
- BootstrapEvent used as transport only

## Exit Criteria
- [ ] IAuthenticationEventManager is the single event gateway
- [ ] All AUTH events (AUTH-001, AUTH-002, AUTH-003) published via AUTH-004
- [ ] Events validated before publishing
- [ ] Events deduplicated (same event within time window)
- [ ] Events persisted to AUTH_EVENTS domain
- [ ] Correlation IDs assigned to all events
- [ ] Events forwarded to BootstrapEvent after processing
- [ ] Event replay capability works
- [ ] AuthenticationEngine, LoginOrchestrator, AuthStateManager modified
- [ ] Build passes