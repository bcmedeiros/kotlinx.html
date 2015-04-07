package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public trait CoreAttributeGroupFacade : Tag {
    var accessKey : String
        get()  = attributeStringAccessKey74fe7889.get(this, "accesskey")
        set(newValue) {attributeStringAccessKey74fe7889.set(this, "accesskey", newValue)}

    var classes : String
        get()  = attributeStringClassf8b4e386.get(this, "class")
        set(newValue) {attributeStringClassf8b4e386.set(this, "class", newValue)}

    var contentEditable : Boolean
        get()  = attributeBooleanContentEditable678b16f4.get(this, "contenteditable")
        set(newValue) {attributeBooleanContentEditable678b16f4.set(this, "contenteditable", newValue)}

    var contextMenu : String
        get()  = attributeStringContextMenuecf9159c.get(this, "contextmenu")
        set(newValue) {attributeStringContextMenuecf9159c.set(this, "contextmenu", newValue)}

    var dataFolderName : String
        get()  = attributeStringDataFolderName1124284a.get(this, "data-FolderName")
        set(newValue) {attributeStringDataFolderName1124284a.set(this, "data-FolderName", newValue)}

    var dataMsgId : String
        get()  = attributeStringDataMsgIdfc2f3a87.get(this, "data-MsgId")
        set(newValue) {attributeStringDataMsgIdfc2f3a87.set(this, "data-MsgId", newValue)}

    var dir : Dir
        get()  = attributeDirDirDirValuesad374216.get(this, "dir")
        set(newValue) {attributeDirDirDirValuesad374216.set(this, "dir", newValue)}

    var draggable : Draggable
        get()  = attributeDraggableDraggableDraggableValuesbc5eb116.get(this, "draggable")
        set(newValue) {attributeDraggableDraggableDraggableValuesbc5eb116.set(this, "draggable", newValue)}

    var hidden : Boolean
        get()  = attributeBooleanHiddenHiddenEmpty480fe417.get(this, "hidden")
        set(newValue) {attributeBooleanHiddenHiddenEmpty480fe417.set(this, "hidden", newValue)}

    var id : String
        get()  = attributeStringf30f39f0.get(this, "id")
        set(newValue) {attributeStringf30f39f0.set(this, "id", newValue)}

    var item : String
        get()  = attributeStringf30f39f0.get(this, "item")
        set(newValue) {attributeStringf30f39f0.set(this, "item", newValue)}

    var itemProp : String
        get()  = attributeStringItemProp394b9704.get(this, "itemprop")
        set(newValue) {attributeStringItemProp394b9704.set(this, "itemprop", newValue)}

    var lang : String
        get()  = attributeStringf30f39f0.get(this, "lang")
        set(newValue) {attributeStringf30f39f0.set(this, "lang", newValue)}

    var role : String
        get()  = attributeStringf30f39f0.get(this, "role")
        set(newValue) {attributeStringf30f39f0.set(this, "role", newValue)}

    var runAt : RunAt
        get()  = attributeRunAtRunAtRunAtValuesf5579e25.get(this, "runat")
        set(newValue) {attributeRunAtRunAtRunAtValuesf5579e25.set(this, "runat", newValue)}

    var spellCheck : Boolean
        get()  = attributeBooleanSpellCheck2141d9f7.get(this, "spellcheck")
        set(newValue) {attributeBooleanSpellCheck2141d9f7.set(this, "spellcheck", newValue)}

    var style : String
        get()  = attributeStringf30f39f0.get(this, "style")
        set(newValue) {attributeStringf30f39f0.set(this, "style", newValue)}

    var subject : String
        get()  = attributeStringf30f39f0.get(this, "subject")
        set(newValue) {attributeStringf30f39f0.set(this, "subject", newValue)}

    var tabIndex : String
        get()  = attributeStringf30f39f0.get(this, "tabIndex")
        set(newValue) {attributeStringf30f39f0.set(this, "tabIndex", newValue)}

    var title : String
        get()  = attributeStringf30f39f0.get(this, "title")
        set(newValue) {attributeStringf30f39f0.set(this, "title", newValue)}

}

public trait AServerAttributeGroupFacade : Tag {
    var onServerClick : String
        get()  = attributeStringOnServerClick1077aa94.get(this, "OnServerClick")
        set(newValue) {attributeStringOnServerClick1077aa94.set(this, "OnServerClick", newValue)}

}

public trait ButtonServerAttributeGroupFacade : Tag {
    var causesValidation : Boolean
        get()  = attributeBooleanCausesValidation5001927a.get(this, "CausesValidation")
        set(newValue) {attributeBooleanCausesValidation5001927a.set(this, "CausesValidation", newValue)}

    var validationGroup : String
        get()  = attributeStringValidationGroupb2201374.get(this, "ValidationGroup")
        set(newValue) {attributeStringValidationGroupb2201374.set(this, "ValidationGroup", newValue)}

}

public trait SelectServerAttributeGroupFacade : Tag {
    var dataSourceID : String
        get()  = attributeStringDataSourceIDb40d6e6e.get(this, "DataSourceID")
        set(newValue) {attributeStringDataSourceIDb40d6e6e.set(this, "DataSourceID", newValue)}

    var dataTextField : String
        get()  = attributeStringDataTextField77d63931.get(this, "DataTextField")
        set(newValue) {attributeStringDataTextField77d63931.set(this, "DataTextField", newValue)}

    var dataValueField : String
        get()  = attributeStringDataValueField27fc2381.get(this, "DataValueField")
        set(newValue) {attributeStringDataValueField27fc2381.set(this, "DataValueField", newValue)}

    var onServerChange : String
        get()  = attributeStringOnServerChange82790280.get(this, "OnServerChange")
        set(newValue) {attributeStringOnServerChange82790280.set(this, "OnServerChange", newValue)}

}

public trait FormServerAttributeGroupFacade : Tag {
    var defaultButton : String
        get()  = attributeStringDefaultButton3fc5dec1.get(this, "DefaultButton")
        set(newValue) {attributeStringDefaultButton3fc5dec1.set(this, "DefaultButton", newValue)}

    var defaultFocus : String
        get()  = attributeStringDefaultFocusd4b5dd45.get(this, "DefaultFocus")
        set(newValue) {attributeStringDefaultFocusd4b5dd45.set(this, "DefaultFocus", newValue)}

    var submitDisabledControls : Boolean
        get()  = attributeBooleanSubmitDisabledControlsd14426c1.get(this, "SubmitDisabledControls")
        set(newValue) {attributeBooleanSubmitDisabledControlsd14426c1.set(this, "SubmitDisabledControls", newValue)}

}

public trait CoreServerAttributeGroupFacade : Tag {
    var enableTheming : Boolean
        get()  = attributeBooleanEnableTheming9d52ba3a.get(this, "EnableTheming")
        set(newValue) {attributeBooleanEnableTheming9d52ba3a.set(this, "EnableTheming", newValue)}

    var enableViewState : Boolean
        get()  = attributeBooleanEnableViewState5cff2ba0.get(this, "EnableViewState")
        set(newValue) {attributeBooleanEnableViewState5cff2ba0.set(this, "EnableViewState", newValue)}

    var onDataBinding : String
        get()  = attributeStringOnDataBindinge080360a.get(this, "OnDataBinding")
        set(newValue) {attributeStringOnDataBindinge080360a.set(this, "OnDataBinding", newValue)}

    var onDisposed : String
        get()  = attributeStringOnDisposed1ffad752.get(this, "OnDisposed")
        set(newValue) {attributeStringOnDisposed1ffad752.set(this, "OnDisposed", newValue)}

    var onInit : String
        get()  = attributeStringOnInit800f05bd.get(this, "OnInit")
        set(newValue) {attributeStringOnInit800f05bd.set(this, "OnInit", newValue)}

    var onPreREndEr : String
        get()  = attributeStringOnPreREndEre55f38e8.get(this, "OnPreRender")
        set(newValue) {attributeStringOnPreREndEre55f38e8.set(this, "OnPreRender", newValue)}

    var skinID : String
        get()  = attributeStringSkinID86c6a986.get(this, "SkinID")
        set(newValue) {attributeStringSkinID86c6a986.set(this, "SkinID", newValue)}

    var visible : Boolean
        get()  = attributeBooleanVisiblefa770569.get(this, "Visible")
        set(newValue) {attributeBooleanVisiblefa770569.set(this, "Visible", newValue)}

}

public trait CommonEventsGroupFacade : Tag {
    var onAbort : String
        get()  = attributeStringOnAborta41d22bf.get(this, "onabort")
        set(newValue) {attributeStringOnAborta41d22bf.set(this, "onabort", newValue)}

    var onBlur : String
        get()  = attributeStringOnBlurb6b570d4.get(this, "onblur")
        set(newValue) {attributeStringOnBlurb6b570d4.set(this, "onblur", newValue)}

    var onCanPlay : String
        get()  = attributeStringOnCanPlay4e4653.get(this, "oncanplay")
        set(newValue) {attributeStringOnCanPlay4e4653.set(this, "oncanplay", newValue)}

    var onCanPlayThrough : String
        get()  = attributeStringOnCanPlayThrough8f0150ee.get(this, "oncanplaythrough")
        set(newValue) {attributeStringOnCanPlayThrough8f0150ee.set(this, "oncanplaythrough", newValue)}

    var onChange : String
        get()  = attributeStringOnChange6776385d.get(this, "onchange")
        set(newValue) {attributeStringOnChange6776385d.set(this, "onchange", newValue)}

    var onClick : String
        get()  = attributeStringOnClicka43dc517.get(this, "onclick")
        set(newValue) {attributeStringOnClicka43dc517.set(this, "onclick", newValue)}

    var onContextMenu : String
        get()  = attributeStringOnContextMenua61df65d.get(this, "oncontextmenu")
        set(newValue) {attributeStringOnContextMenua61df65d.set(this, "oncontextmenu", newValue)}

    var onDoubleClick : String
        get()  = attributeStringOnDoubleClick26585787.get(this, "ondblclick")
        set(newValue) {attributeStringOnDoubleClick26585787.set(this, "ondblclick", newValue)}

    var onDrag : String
        get()  = attributeStringOnDragb6b66da1.get(this, "ondrag")
        set(newValue) {attributeStringOnDragb6b66da1.set(this, "ondrag", newValue)}

    var onDragEnter : String
        get()  = attributeStringOnDragEnter678b5133.get(this, "ondragenter")
        set(newValue) {attributeStringOnDragEnter678b5133.set(this, "ondragenter", newValue)}

    var onDragLeave : String
        get()  = attributeStringOnDragLeave67e99912.get(this, "ondragleave")
        set(newValue) {attributeStringOnDragLeave67e99912.set(this, "ondragleave", newValue)}

    var onDragOver : String
        get()  = attributeStringOnDragOver6230a8f5.get(this, "ondragover")
        set(newValue) {attributeStringOnDragOver6230a8f5.set(this, "ondragover", newValue)}

    var onDragStart : String
        get()  = attributeStringOnDragStart68530ebd.get(this, "ondragstart")
        set(newValue) {attributeStringOnDragStart68530ebd.set(this, "ondragstart", newValue)}

    var onDrop : String
        get()  = attributeStringOnDropb6b66f5c.get(this, "ondrop")
        set(newValue) {attributeStringOnDropb6b66f5c.set(this, "ondrop", newValue)}

    var onDurationChange : String
        get()  = attributeStringOnDurationChange679df7f1.get(this, "ondurationchange")
        set(newValue) {attributeStringOnDurationChange679df7f1.set(this, "ondurationchange", newValue)}

    var onEmptied : String
        get()  = attributeStringOnEmptied7eb2d9eb.get(this, "onemptied")
        set(newValue) {attributeStringOnEmptied7eb2d9eb.set(this, "onemptied", newValue)}

    var onEnded : String
        get()  = attributeStringOnEndeda45aca49.get(this, "onended")
        set(newValue) {attributeStringOnEndeda45aca49.set(this, "onended", newValue)}

    var onError : String
        get()  = attributeStringOnErrora45cd197.get(this, "onerror")
        set(newValue) {attributeStringOnErrora45cd197.set(this, "onerror", newValue)}

    var onFocus : String
        get()  = attributeStringOnFocusa4695467.get(this, "onfocus")
        set(newValue) {attributeStringOnFocusa4695467.set(this, "onfocus", newValue)}

    var onFormChange : String
        get()  = attributeStringOnFormChange596e3aa1.get(this, "onformchange")
        set(newValue) {attributeStringOnFormChange596e3aa1.set(this, "onformchange", newValue)}

    var onFormInput : String
        get()  = attributeStringOnFormInpute62ffc95.get(this, "onforminput")
        set(newValue) {attributeStringOnFormInpute62ffc95.set(this, "onforminput", newValue)}

    var onInput : String
        get()  = attributeStringOnInputa4935759.get(this, "oninput")
        set(newValue) {attributeStringOnInputa4935759.set(this, "oninput", newValue)}

    var onInvalid : String
        get()  = attributeStringOnInvalid544c9546.get(this, "oninvalid")
        set(newValue) {attributeStringOnInvalid544c9546.set(this, "oninvalid", newValue)}

    var onKeyDown : String
        get()  = attributeStringOnKeyDownaee91ed0.get(this, "onkeydown")
        set(newValue) {attributeStringOnKeyDownaee91ed0.set(this, "onkeydown", newValue)}

    var onKeyPress : String
        get()  = attributeStringOnKeyPressb31c2231.get(this, "onkeypress")
        set(newValue) {attributeStringOnKeyPressb31c2231.set(this, "onkeypress", newValue)}

    var onKeyUp : String
        get()  = attributeStringOnKeyUpa4ab90c9.get(this, "onkeyup")
        set(newValue) {attributeStringOnKeyUpa4ab90c9.set(this, "onkeyup", newValue)}

    var onLoad : String
        get()  = attributeStringOnLoadb6ba0553.get(this, "onload")
        set(newValue) {attributeStringOnLoadb6ba0553.set(this, "onload", newValue)}

    var onLoadedData : String
        get()  = attributeStringOnLoadedData544d525c.get(this, "onloadeddata")
        set(newValue) {attributeStringOnLoadedData544d525c.set(this, "onloadeddata", newValue)}

    var onLoadedMetaData : String
        get()  = attributeStringOnLoadedMetaData567eebe1.get(this, "onloadedmetadata")
        set(newValue) {attributeStringOnLoadedMetaData567eebe1.set(this, "onloadedmetadata", newValue)}

    var onLoadStart : String
        get()  = attributeStringOnLoadStartcdb4764b.get(this, "onloadstart")
        set(newValue) {attributeStringOnLoadStartcdb4764b.set(this, "onloadstart", newValue)}

    var onMouseDown : String
        get()  = attributeStringOnMouseDown9cc1ddd6.get(this, "onmousedown")
        set(newValue) {attributeStringOnMouseDown9cc1ddd6.set(this, "onmousedown", newValue)}

    var onMouseMove : String
        get()  = attributeStringOnMouseMove9cc5f505.get(this, "onmousemove")
        set(newValue) {attributeStringOnMouseMove9cc5f505.set(this, "onmousemove", newValue)}

    var onMouseOut : String
        get()  = attributeStringOnMouseOut8d2ded76.get(this, "onmouseout")
        set(newValue) {attributeStringOnMouseOut8d2ded76.set(this, "onmouseout", newValue)}

    var onMouseOver : String
        get()  = attributeStringOnMouseOver9cc6f608.get(this, "onmouseover")
        set(newValue) {attributeStringOnMouseOver9cc6f608.set(this, "onmouseover", newValue)}

    var onMouseUp : String
        get()  = attributeStringOnMouseUp2994594f.get(this, "onmouseup")
        set(newValue) {attributeStringOnMouseUp2994594f.set(this, "onmouseup", newValue)}

    var onMouseWheel : String
        get()  = attributeStringOnMouseWheel80b95b03.get(this, "onmousewheel")
        set(newValue) {attributeStringOnMouseWheel80b95b03.set(this, "onmousewheel", newValue)}

    var onPause : String
        get()  = attributeStringOnPausea4f02585.get(this, "onpause")
        set(newValue) {attributeStringOnPausea4f02585.set(this, "onpause", newValue)}

    var onPlay : String
        get()  = attributeStringOnPlayb6bbcba1.get(this, "onplay")
        set(newValue) {attributeStringOnPlayb6bbcba1.set(this, "onplay", newValue)}

    var onPlaying : String
        get()  = attributeStringOnPlayingc211737d.get(this, "onplaying")
        set(newValue) {attributeStringOnPlayingc211737d.set(this, "onplaying", newValue)}

    var onProgress : String
        get()  = attributeStringOnProgress58a3bb1a.get(this, "onprogress")
        set(newValue) {attributeStringOnProgress58a3bb1a.set(this, "onprogress", newValue)}

    var onRateChange : String
        get()  = attributeStringOnRateChanged9b1f5bd.get(this, "onratechange")
        set(newValue) {attributeStringOnRateChanged9b1f5bd.set(this, "onratechange", newValue)}

    var onReadyStateChange : String
        get()  = attributeStringOnReadyStateChange82a8e3eb.get(this, "onreadystatechange")
        set(newValue) {attributeStringOnReadyStateChange82a8e3eb.set(this, "onreadystatechange", newValue)}

    var onScroll : String
        get()  = attributeStringOnScroll82850b7a.get(this, "onscroll")
        set(newValue) {attributeStringOnScroll82850b7a.set(this, "onscroll", newValue)}

    var onSeeked : String
        get()  = attributeStringOnSeeked829b41c4.get(this, "onseeked")
        set(newValue) {attributeStringOnSeeked829b41c4.set(this, "onseeked", newValue)}

    var onSeeking : String
        get()  = attributeStringOnSeeking550439b9.get(this, "onseeking")
        set(newValue) {attributeStringOnSeeking550439b9.set(this, "onseeking", newValue)}

    var onSelect : String
        get()  = attributeStringOnSelect829e59a9.get(this, "onselect")
        set(newValue) {attributeStringOnSelect829e59a9.set(this, "onselect", newValue)}

    var onShow : String
        get()  = attributeStringOnShowb6bd1b6a.get(this, "onshow")
        set(newValue) {attributeStringOnShowb6bd1b6a.set(this, "onshow", newValue)}

    var onStalled : String
        get()  = attributeStringOnStalled6e650b8e.get(this, "onstalled")
        set(newValue) {attributeStringOnStalled6e650b8e.set(this, "onstalled", newValue)}

    var onSubmit : String
        get()  = attributeStringOnSubmit837b64c5.get(this, "onsubmit")
        set(newValue) {attributeStringOnSubmit837b64c5.set(this, "onsubmit", newValue)}

    var onSuspend : String
        get()  = attributeStringOnSuspend7119438b.get(this, "onsuspend")
        set(newValue) {attributeStringOnSuspend7119438b.set(this, "onsuspend", newValue)}

    var onTimeUpdate : String
        get()  = attributeStringOnTimeUpdateac693b03.get(this, "ontimeupdate")
        set(newValue) {attributeStringOnTimeUpdateac693b03.set(this, "ontimeupdate", newValue)}

    var onVolumeChange : String
        get()  = attributeStringOnVolumeChange146130b7.get(this, "onvolumechange")
        set(newValue) {attributeStringOnVolumeChange146130b7.set(this, "onvolumechange", newValue)}

    var onWaiting : String
        get()  = attributeStringOnWaiting2206399c.get(this, "onwaiting")
        set(newValue) {attributeStringOnWaiting2206399c.set(this, "onwaiting", newValue)}

}

