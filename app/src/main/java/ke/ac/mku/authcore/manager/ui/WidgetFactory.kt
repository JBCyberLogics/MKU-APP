package ke.ac.mku.authcore.manager.ui

import ke.ac.mku.authcore.domain.model.ui.WidgetDefinition
import ke.ac.mku.authcore.domain.model.ui.WidgetMetadata
import ke.ac.mku.authcore.domain.model.ui.WidgetVisibility
import javax.inject.Inject
import javax.inject.Singleton

/**
 * WidgetFactory - PROGRAM-016
 *
 * Creates widget metadata instances from definitions.
 */
@Singleton
class WidgetFactory @Inject constructor() {

    fun createMetadata(definition: WidgetDefinition): WidgetMetadata {
        return WidgetMetadata(
            definition = definition,
            currentPriority = definition.defaultPriority,
            visibility = WidgetVisibility.AUTO
        )
    }
}
