package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.domain.model.portal.FormControl
import ke.ac.mku.authcore.domain.model.portal.FormMap
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import javax.inject.Inject
import javax.inject.Singleton

/**
 * FormAnalyzer - PROGRAM-006
 *
 * Extracts forms and controls from the document.
 */
@Singleton
class FormAnalyzer @Inject constructor() {

    companion object {
        private const val TAG = "FormAnalyzer"
    }

    /**
     * Extract all forms from the document.
     */
    fun analyze(doc: Document): List<FormMap> {
        val forms = doc.select("form")
        Log.d(TAG, "Found ${forms.size} forms to analyze.")
        
        return forms.mapIndexed { index, element ->
            extractForm(element, element.id().takeIf { it.isNotBlank() } ?: "form_$index")
        }
    }

    private fun extractForm(element: Element, id: String): FormMap {
        val controls = element.select("input, select, textarea, button").map { ctrl ->
            val name = ctrl.attr("name")
            val type = ctrl.tagName().let { tag ->
                if (tag == "input") ctrl.attr("type") else tag
            }
            val label = findLabelFor(ctrl)
            val value = ctrl.attr("value")
            val isRequired = ctrl.hasAttr("required")

            FormControl(name, type, label, value, isRequired)
        }.filter { it.name.isNotBlank() }

        return FormMap(
            id = id,
            action = element.attr("action"),
            method = element.attr("method"),
            controls = controls
        )
    }

    private fun findLabelFor(element: Element): String? {
        val id = element.id()
        if (id.isNotBlank()) {
            val label = element.ownerDocument()?.select("label[for=$id]")?.first()
            if (label != null) return label.text()
        }
        
        // Try parent or sibling as fallback
        return element.parent()?.select("label")?.first()?.text()
            ?: element.previousElementSibling()?.takeIf { it.tagName() == "label" }?.text()
    }
}
