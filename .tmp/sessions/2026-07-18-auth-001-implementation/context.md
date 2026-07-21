# Task Context: AUTH-001 Authentication Engine Implementation

Session ID: 2026-07-18-auth-001-implementation
Created: 2026-07-18T00:00:00Z
Status: in_progress

## Current Request
Implement AUTH-001 Authentication Engine per the AUTH-001 module specification. This is the central authentication orchestration engine that coordinates secure authentication against the MKU Student Portal without owning networking, storage, cryptography, or session management.

## Architecture Decisions (Pre-Approved)

### Decision 1: Contract Location
- IAuthenticationEngine is a CORE-012 platform contract
- Location: `contracts/authentication/IAuthenticationEngine.kt`
- Implemented by: `AuthenticationEngine` in AUTH-001 layer
- Visibility: Public - single entry point for all authentication

### Decision 2: Network Abstraction
- AuthenticationEngine never communicates directly with WebFormLoginHandler
- All authentication traffic passes through `IAuthNetworkService` interface
- Contract location: `contracts/network/IAuthNetworkService.kt`
- Implemented by: `WebFormLoginHandlerAdapter` (NETWORK-002 internal)

### Decision 3: AuthCoreManager Relationship
- AuthenticationEngine becomes primary authentication orchestrator
- AuthCoreManager refactored to internal coordination service
- Single public authentication service: IAuthenticationEngine
- AuthCoreManager not exposed publicly

## Context Files (Standards to Follow)
- /home/darkage/Desktop/mku/.opencode/context/core/standards/code-quality.md
- /home/darkage/Desktop/mku/.opencode/context/core/standards/kotlin-conventions.md (if exists)

## Reference Files (Source Material)
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/contracts/authentication/IAuthCoreManager.kt - existing auth contract pattern
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/manager/AuthCoreManager.kt - existing auth implementation
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/data/api/WebFormLoginHandler.kt - network implementation to abstract
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/bootstrap/BootstrapEvent.kt - event patterns
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/security/monitor/SecurityMonitor.kt - security integration
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/state/AuthenticationState.kt - state enum
- /home/darkage/Desktop/mku/app/src/main/java/ke/ac/mku/authcore/di/AuthCoreModule.kt - DI patterns

## External Docs Fetched
None required - using existing codebase patterns only.

## Components
1. **IAuthenticationEngine** - CORE-012 platform contract (public interface)
2. **IAuthNetworkService** - CORE-012 network abstraction contract
3. **AuthNetworkResponse** - Network response data class
4. **AuthenticationEngine** - AUTH-001 implementation (orchestrator)
5. **WebFormLoginHandlerAdapter** - IAuthNetworkService implementation wrapping WebFormLoginHandler
6. **BootstrapEvent extensions** - 7 new authentication lifecycle events
7. **AuthCoreModule updates** - DI providers and registrations

## Constraints
- AuthenticationEngine must NOT make direct HTTP calls
- All network traffic via IAuthNetworkService interface
- Security validation via SecurityMonitor before every auth request
- Maximum 3 retry attempts, 3 second delay between retries
- Single public authentication entry point: IAuthenticationEngine
- AuthCoreManager becomes internal (not public contract)

## Exit Criteria
- [ ] IAuthenticationEngine is the single public authentication entry point
- [ ] No direct HTTP calls from AuthenticationEngine
- [ ] Security validation via SecurityMonitor before every authentication request
- [ ] All 7 lifecycle events published correctly
- [ ] Retry logic respects maximum_retry_attempts: 3 and retry_delay_seconds: 3
- [ ] AuthenticationEngine registered in ServiceRegistry and DependencyRegistry
- [ ] Build passes with no compilation errors