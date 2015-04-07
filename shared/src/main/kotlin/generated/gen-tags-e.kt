package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class EM(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("em", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class EMBED(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("embed", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var width : String
        get()  = attributeStringf30f39f0.get(this, "width")
        set(newValue) {attributeStringf30f39f0.set(this, "width", newValue)}

    var src : String
        get()  = attributeStringf30f39f0.get(this, "src")
        set(newValue) {attributeStringf30f39f0.set(this, "src", newValue)}

    var height : String
        get()  = attributeStringf30f39f0.get(this, "height")
        set(newValue) {attributeStringf30f39f0.set(this, "height", newValue)}

    var type : String
        get()  = attributeStringf30f39f0.get(this, "type")
        set(newValue) {attributeStringf30f39f0.set(this, "type", newValue)}


}

