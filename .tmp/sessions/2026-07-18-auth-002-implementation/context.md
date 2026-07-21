# Task Context: AUTH-002 Login Orchestrator Implementation

Session ID: 2026-07-18-auth-002-implementation
Created: 2026-07-18T00:00:00Z
Status: in_progress

## Current Request
Implement AUTH-002 Login Orchestrator per the AUTH-002 module specification. Coordinates the complete login workflow by orchestrating Authentication Engine, Network Layer, Security Layer, Session Layer, Cookie Layer, and Portal Layer. Owns workflow sequencing only and delegates all specialized operations to their respective modules.

## Architecture Decisions (Pre-Approved)

### Decision 1: Contract Location
- ILoginOrchestrator is a CORE-012 platform contract
- Location: `contracts/authentication/ILoginOrchestrator.kt`
- Implemented by: `LoginOrchestrator` in AUTH-002 layer
- Visibility: Public - single entry point for login workflow

### Decision 2: Portal Abstraction (Option C)
- IPortalConnector wraps existing PortalSDK, PortalDiscovery, EndpointRegistry
- Location: `contracts/portal/IPortalConnector.kt`
- Implemented by: `PortalConnectorImpl` (PORTAL-001 internal)
- No duplicate logic - delegates to existing components

### Decision 3: State Machine Pattern
- Workflow state machine using sealed class
- 12 states: IDLE → PLATFORM_VALIDATION → CREDENTIAL_VALIDATION → AUTHENTICATION → RESPONSE_VERIFICATION → SESSION_INITIALIZATION → COOKIE_INITIALIZATION → PORTAL_CONNECTION → NOTIFICATION → COMPLETED (or FAILED/CANCELLED)

## Context Files (Standards to Follow)
- /home/darkage/Desktop/mku/.opencode/context/core/standards/code-quality.md
- /home/darkage/Desktop/mku/.opencode/context/core/standards/kotlin-conventions.md (if exists)

## Reference Files (Source Material)
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/contracts/authentication/IAuthenticationEngine.kt - existing auth contract pattern
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/auth/engine/AuthenticationEngine.kt - existing auth engine implementation
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/contracts/authentication/ISessionManager.kt - session contract
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/contracts/authentication/ICookieManager.kt - cookie contract
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/registry/PortalSDK.kt - existing portal SDK
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/registry/PortalDiscovery.kt - existing portal discovery
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/registry/EndpointRegistry.kt - existing endpoint registry
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/bootstrap/BootstrapEvent.kt - event patterns
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/di/AuthCoreModule.kt - DI patterns

## Components to Create
1. **ILoginOrchestrator** - CORE-012 platform contract (public interface)
2. **IPortalConnector** - CORE-012 portal abstraction contract
3. **PortalModels** - PortalConnectionResult, PortalInfo, PortalConnectionState
4. **LoginOrchestrator** - AUTH-002 workflow orchestrator implementation
5. **PortalConnectorImpl** - IPortalConnector implementation wrapping existing components
6. **BootstrapEvent extensions** - 8 new workflow events
7. **AuthCoreModule updates** - DI providers and registrations

## Constraints
- LoginOrchestrator must NOT make direct HTTP calls
- All portal operations via IPortalConnector interface
- All authentication via IAuthenticationEngine
- All session/cookie operations via ISessionManager/ICookieManager
- Single active login (allow_parallel_logins: false)
- Maximum 3 retry attempts
- Authentication timeout: 60 seconds
- State machine driven execution
- Event driven execution

## Exit Criteria
- [ ] ILoginOrchestrator is the single public login workflow entry point
- [ ] All 12 workflow steps execute in correct order
- [ ] No direct HTTP calls from LoginOrchestrator
- [ ] Security validation via ISecurityMonitor before login
- [ ] All 8 workflow lifecycle events published correctly
- [ ] IPortalConnector wraps PortalSDK without duplicating logic
- [ ] Retry logic respects maximum_retry_attempts: 3
- [ ] LoginOrchestrator registered in ServiceRegistry and DependencyRegistry
- [ ] Build passes