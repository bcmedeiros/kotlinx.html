package html4k

import html4k.*
import html4k.impl.*
import html4k.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public open class DATALIST(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("datalist", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}
fun DATALIST.option(classes : String? = null, block : OPTION.() -> Unit) : Unit = buildOPTION(listOf("class" to stringSetDecode(classes)?.stringSetEncode()).toAttributesMap(), consumer, block)
fun DATALIST.option(classes : String? = null, content : String = "") : Unit = buildOPTION(listOf("class" to stringSetDecode(classes)?.stringSetEncode()).toAttributesMap(), consumer, {+content})


public open class DD(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dd", consumer, initialAttributes), CommonAttributeGroupFacade, FlowContent {

}

public open class DEL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("del", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {
    var cite : String
        get()  = attributeStringString.get(this, "cite")
        set(newValue) {attributeStringString.set(this, "cite", newValue)}

    var dateTime : String
        get()  = attributeStringString.get(this, "datetime")
        set(newValue) {attributeStringString.set(this, "datetime", newValue)}


}

public open class DETAILS(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("details", consumer, initialAttributes), CommonAttributeGroupFacade, FlowContent {
    var open : Boolean
        get()  = attributeBooleanTicker.get(this, "open")
        set(newValue) {attributeBooleanTicker.set(this, "open", newValue)}


}
fun DETAILS.legEnd(classes : String? = null, block : LEGEND.() -> Unit) : Unit = buildLEGEND(listOf("class" to stringSetDecode(classes)?.stringSetEncode()).toAttributesMap(), consumer, block)


public open class DFN(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dfn", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}

public open class DIALOG(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dialog", consumer, initialAttributes), CommonAttributeGroupFacade, FlowContent {

}

public open class DIV(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("div", consumer, initialAttributes), CommonAttributeGroupFacade, FlowContent {

}

public open class DL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dl", consumer, initialAttributes), CommonAttributeGroupFacade {

}
fun DL.dd(classes : String? = null, block : DD.() -> Unit) : Unit = buildDD(listOf("class" to stringSetDecode(classes)?.stringSetEncode()).toAttributesMap(), consumer, block)

fun DL.dt(classes : String? = null, block : DT.() -> Unit) : Unit = buildDT(listOf("class" to stringSetDecode(classes)?.stringSetEncode()).toAttributesMap(), consumer, block)


public open class DT(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dt", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}

