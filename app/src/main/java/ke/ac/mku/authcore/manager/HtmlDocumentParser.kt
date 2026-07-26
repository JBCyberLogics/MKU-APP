package ke.ac.mku.authcore.manager

import android.util.Log
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import javax.inject.Inject
import javax.inject.Singleton

/**
 * HtmlDocumentParser - PROGRAM-006
 *
 * Uses Jsoup to parse HTML into a normalized DOM tree.
 */
@Singleton
class HtmlDocumentParser @Inject constructor() {

    companion object {
        private const val TAG = "HtmlParser"
    }

    /**
     * Parse HTML string into a Jsoup Document.
     */
    fun parse(html: String): Document {
        Log.d(TAG, "Parsing HTML document (${html.length} chars)...")
        return Jsoup.parse(html)
    }

    /**
     * Clean and normalize the document by removing non-semantic markup.
     */
    fun normalize(doc: Document): Document {
        // Remove scripts, styles, and other presentation elements
        doc.select("script, style, link, iframe, noscript").remove()
        
        // Normalize whitespace in text nodes
        doc.outputSettings().prettyPrint(true)
        
        return doc
    }
}
