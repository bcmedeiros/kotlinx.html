package html4k.stream

import html4k.*
import html4k.Entities.*
import html4k.consumers.delayed

class HTMLStreamBuilder<O : Appendable>(val out : O) : TagConsumer<O> {

    override fun onTagStart(tag: Tag) {
        out.append("<")
        out.append(tag.tagName)

        if (tag.attributes.isNotEmpty()) {
            tag.attributes.entrySet().map { e ->
                if (!e.getKey().isValidXmlAttributeName()) {
                    throw IllegalArgumentException("Tag ${tag.tagName} has invalid attribute name ${e.getKey()}")
                }
                StringBuilder {
                    append(e.getKey())
                    append("=\"")
                    escapeAppend(e.getValue())
                    append("\"")
                }
            }.joinTo(out, " ", " ")
        }

        out.append(">")
    }

    override fun onTagAttributeChange(tag : Tag, attribute: String, value: String) {
        throw UnsupportedOperationException("tag attribute can't be changed as it was already written to the stream. Use with DelayedConsumer to be able to modify attributes")
    }

    override fun onTagEnd(tag: Tag) {
        out.append("</")
        out.append(tag.tagName)
        out.append(">")
    }

    override fun onTagContent(content: CharSequence) {
        out.escapeAppend(content)
    }

    override fun onTagContentEntity(entity: Entities) {
        out.append(entity.text)
    }

    override fun finalize(): O = out
}

public fun <O : Appendable> O.appendHTML() : TagConsumer<O> = HTMLStreamBuilder(this).delayed()

private val escapeMap = mapOf(
        '<' to "&lt;",
        '>' to "&gt;",
        '&' to "&amp;",
        '\'' to "&apos;",
        '\"' to "&quot;"
)

private fun Char._isLetter() = this in 'a' .. 'z' || this in 'A' .. 'Z'
private fun Char._isDigit() = this in '0' .. '9'
//private fun String.contains(ch : Char) = this.indexOf(ch) != -1

private fun String.isValidXmlAttributeName() =
        !this.toLowerCase().startsWith("xml")
                && this.isNotEmpty()
                && (this[0]._isLetter() || this[0] == '_')
                && this.all { it._isLetter() || it._isDigit() || "._:".indexOf(it) != -1 }

private fun Appendable.escapeAppend(s : CharSequence) {
    var lastIndex = 0
    for (idx in s.length().indices) {
        val ch = s[idx]
        val escape = escapeMap[ch]
        if (escape != null) {
            append(s, lastIndex, idx)
            append(escape)
            lastIndex = idx + 1
        }
    }

    if (lastIndex < s.length()) {
        append(s, lastIndex, s.length())
    }
}