package ke.ac.mku.authcore.manager.ui

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import ke.ac.mku.authcore.domain.model.ui.ResponsiveGrid
import javax.inject.Inject
import javax.inject.Singleton

/**
 * GridGenerationEngine - PROGRAM-018
 *
 * Builds responsive dashboard grids based on device screen metrics.
 */
@Singleton
class GridGenerationEngine @Inject constructor(
    @ApplicationContext private val context: Context
) {

    fun generateGrid(): ResponsiveGrid {
        val configuration = context.resources.configuration
        val screenWidthDp = configuration.screenWidthDp

        val columns = when {
            screenWidthDp >= 840 -> 6 // Foldables/Large Tablets
            screenWidthDp >= 600 -> 4 // Tablets
            else -> 2 // Phones
        }

        return ResponsiveGrid(
            columnCount = columns,
            horizontalSpacing = 16,
            verticalSpacing = 16
        )
    }
}
