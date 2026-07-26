package ke.ac.mku.authcore.manager

import ke.ac.mku.authcore.domain.model.portal.ContextDelta
import ke.ac.mku.authcore.domain.model.portal.DeltaItem
import ke.ac.mku.authcore.domain.model.portal.StudentContext
import java.util.UUID
import javax.inject.Inject
import javax.inject.Singleton

/**
 * DeltaComputationEngine - PROGRAM-012
 *
 * Calculates minimal differences between context versions.
 */
@Singleton
class DeltaComputationEngine @Inject constructor() {

    fun computeDelta(old: StudentContext?, current: StudentContext, changedDomains: List<String>): ContextDelta {
        val items = mutableListOf<DeltaItem>()
        
        if (changedDomains.contains("finance")) {
            items.add(DeltaItem(
                domain = "finance",
                path = "feeBalance",
                oldValue = old?.finance?.feeBalance,
                newValue = current.finance.feeBalance
            ))
        }
        
        return ContextDelta(
            deltaId = "delta_${UUID.randomUUID()}",
            timestamp = System.currentTimeMillis(),
            items = items,
            impactedDomains = changedDomains
        )
    }
}
