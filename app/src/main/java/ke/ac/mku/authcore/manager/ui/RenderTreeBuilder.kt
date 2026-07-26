package ke.ac.mku.authcore.manager.ui

import ke.ac.mku.authcore.domain.model.ui.DashboardSection
import ke.ac.mku.authcore.domain.model.ui.RenderNode
import ke.ac.mku.authcore.domain.model.ui.RenderTree
import java.util.UUID
import javax.inject.Inject
import javax.inject.Singleton

/**
 * RenderTreeBuilder - PROGRAM-018
 *
 * Constructs the final hierarchical render tree.
 */
@Singleton
class RenderTreeBuilder @Inject constructor() {

    fun build(sections: List<DashboardSection>): RenderTree {
        val root = RenderNode(
            id = "root",
            type = "CONTAINER",
            children = sections.map { section ->
                RenderNode(
                    id = section.sectionId,
                    type = "SECTION",
                    children = section.widgets.map { widget ->
                        RenderNode(
                            id = widget.definition.widgetId,
                            type = "WIDGET",
                            metadata = mapOf("category" to widget.definition.category.name)
                        )
                    }
                )
            }
        )

        return RenderTree(
            root = root,
            generatedAt = System.currentTimeMillis()
        )
    }
}
