package ke.ac.mku.authcore.bootstrap

enum class BootstrapState {
    IDLE,
    BOOTSTRAPPING,
    VALIDATING,
    INITIALIZING,
    READY,
    FAILED
}