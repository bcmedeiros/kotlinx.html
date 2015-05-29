package html4k

import html4k.*
import html4k.impl.*
import html4k.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public open class RP(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("rp", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}

public open class RT(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("rt", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}

public open class RUBY(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("ruby", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}
fun RUBY.rt(classes : String? = null, block : RT.() -> Unit) : Unit = buildRT(listOf("class" to stringSetDecode(classes)?.stringSetEncode()).toAttributesMap(), consumer, block)

fun RUBY.rp(classes : String? = null, block : RP.() -> Unit) : Unit = buildRP(listOf("class" to stringSetDecode(classes)?.stringSetEncode()).toAttributesMap(), consumer, block)


