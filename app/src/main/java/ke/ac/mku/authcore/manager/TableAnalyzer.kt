package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.domain.model.portal.TableMap
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import javax.inject.Inject
import javax.inject.Singleton

/**
 * TableAnalyzer - PROGRAM-006
 *
 * Extracts structured data from tables.
 */
@Singleton
class TableAnalyzer @Inject constructor() {

    companion object {
        private const val TAG = "TableAnalyzer"
    }

    /**
     * Extract all tables from the document as a list of TableMap.
     */
    fun analyze(doc: Document): List<TableMap> {
        val tables = doc.select("table")
        Log.d(TAG, "Found ${tables.size} tables to analyze.")
        
        return tables.mapIndexed { index, element ->
            extractTable(element, "table_$index")
        }
    }

    private fun extractTable(element: Element, id: String): TableMap {
        val headers = element.select("th").map { it.text() }
        val rows = element.select("tr").map { row ->
            row.select("td").map { it.text() }
        }.filter { it.isNotEmpty() }
        
        val summary = element.attr("summary").takeIf { it.isNotBlank() }
            ?: element.select("caption").text().takeIf { it.isNotBlank() }

        return TableMap(
            id = id,
            headers = headers,
            rows = rows,
            summary = summary
        )
    }
}
