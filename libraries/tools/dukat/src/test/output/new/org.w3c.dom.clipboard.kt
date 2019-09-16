package org.w3c.dom.clipboard

public val org.w3c.dom.clipboard.PresentationStyle.Companion.ATTACHMENT: org.w3c.dom.clipboard.PresentationStyle
    public inline fun org.w3c.dom.clipboard.PresentationStyle.Companion.<get-ATTACHMENT>(): org.w3c.dom.clipboard.PresentationStyle
public val org.w3c.dom.clipboard.PresentationStyle.Companion.INLINE: org.w3c.dom.clipboard.PresentationStyle
    public inline fun org.w3c.dom.clipboard.PresentationStyle.Companion.<get-INLINE>(): org.w3c.dom.clipboard.PresentationStyle
public val org.w3c.dom.clipboard.PresentationStyle.Companion.UNSPECIFIED: org.w3c.dom.clipboard.PresentationStyle
    public inline fun org.w3c.dom.clipboard.PresentationStyle.Companion.<get-UNSPECIFIED>(): org.w3c.dom.clipboard.PresentationStyle
@kotlin.internal.InlineOnly public inline fun ClipboardEventInit(/*0*/ clipboardData: org.w3c.dom.DataTransfer? = ..., /*1*/ bubbles: kotlin.Boolean? = ..., /*2*/ cancelable: kotlin.Boolean? = ..., /*3*/ composed: kotlin.Boolean? = ...): org.w3c.dom.clipboard.ClipboardEventInit
@kotlin.internal.InlineOnly public inline fun ClipboardItemOptions(/*0*/ presentationStyle: org.w3c.dom.clipboard.PresentationStyle? = ...): org.w3c.dom.clipboard.ClipboardItemOptions
@kotlin.internal.InlineOnly public inline fun ClipboardPermissionDescriptor(/*0*/ allowWithoutGesture: kotlin.Boolean? = ...): org.w3c.dom.clipboard.ClipboardPermissionDescriptor

public open external class Clipboard : org.w3c.dom.events.EventTarget {
    /*primary*/ public constructor Clipboard()
    public final override /*1*/ /*fake_override*/ fun addEventListener(/*0*/ type: kotlin.String, /*1*/ callback: ((org.w3c.dom.events.Event) -> kotlin.Unit)?, /*2*/ options: dynamic = ...): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun addEventListener(/*0*/ type: kotlin.String, /*1*/ callback: org.w3c.dom.events.EventListener?, /*2*/ options: dynamic = ...): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun dispatchEvent(/*0*/ event: org.w3c.dom.events.Event): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public final fun read(): kotlin.js.Promise<kotlin.Array<org.w3c.dom.clipboard.ClipboardItem>>
    public final fun readText(): kotlin.js.Promise<kotlin.String>
    public final override /*1*/ /*fake_override*/ fun removeEventListener(/*0*/ type: kotlin.String, /*1*/ callback: ((org.w3c.dom.events.Event) -> kotlin.Unit)?, /*2*/ options: dynamic = ...): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun removeEventListener(/*0*/ type: kotlin.String, /*1*/ callback: org.w3c.dom.events.EventListener?, /*2*/ options: dynamic = ...): kotlin.Unit
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
    public final fun write(/*0*/ data: kotlin.Array<org.w3c.dom.clipboard.ClipboardItem>): kotlin.js.Promise<kotlin.Unit>
    public final fun writeText(/*0*/ data: kotlin.String): kotlin.js.Promise<kotlin.Unit>
}

public open external class ClipboardEvent : org.w3c.dom.events.Event {
    /*primary*/ public constructor ClipboardEvent(/*0*/ type: kotlin.String, /*1*/ eventInitDict: org.w3c.dom.clipboard.ClipboardEventInit = ...)
    public open override /*1*/ /*fake_override*/ val bubbles: kotlin.Boolean
        public open override /*1*/ /*fake_override*/ fun <get-bubbles>(): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ val cancelable: kotlin.Boolean
        public open override /*1*/ /*fake_override*/ fun <get-cancelable>(): kotlin.Boolean
    public open val clipboardData: org.w3c.dom.DataTransfer?
        public open fun <get-clipboardData>(): org.w3c.dom.DataTransfer?
    public open override /*1*/ /*fake_override*/ val composed: kotlin.Boolean
        public open override /*1*/ /*fake_override*/ fun <get-composed>(): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ val currentTarget: org.w3c.dom.events.EventTarget?
        public open override /*1*/ /*fake_override*/ fun <get-currentTarget>(): org.w3c.dom.events.EventTarget?
    public open override /*1*/ /*fake_override*/ val defaultPrevented: kotlin.Boolean
        public open override /*1*/ /*fake_override*/ fun <get-defaultPrevented>(): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ val eventPhase: kotlin.Short
        public open override /*1*/ /*fake_override*/ fun <get-eventPhase>(): kotlin.Short
    public open override /*1*/ /*fake_override*/ val isTrusted: kotlin.Boolean
        public open override /*1*/ /*fake_override*/ fun <get-isTrusted>(): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ val target: org.w3c.dom.events.EventTarget?
        public open override /*1*/ /*fake_override*/ fun <get-target>(): org.w3c.dom.events.EventTarget?
    public open override /*1*/ /*fake_override*/ val timeStamp: kotlin.Number
        public open override /*1*/ /*fake_override*/ fun <get-timeStamp>(): kotlin.Number
    public open override /*1*/ /*fake_override*/ val type: kotlin.String
        public open override /*1*/ /*fake_override*/ fun <get-type>(): kotlin.String
    public final override /*1*/ /*fake_override*/ fun composedPath(): kotlin.Array<org.w3c.dom.events.EventTarget>
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public final override /*1*/ /*fake_override*/ fun initEvent(/*0*/ type: kotlin.String, /*1*/ bubbles: kotlin.Boolean, /*2*/ cancelable: kotlin.Boolean): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun preventDefault(): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun stopImmediatePropagation(): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun stopPropagation(): kotlin.Unit
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String

    public companion object Companion {
        /*primary*/ private constructor Companion()
        public final val AT_TARGET: kotlin.Short
            public final fun <get-AT_TARGET>(): kotlin.Short
        public final val BUBBLING_PHASE: kotlin.Short
            public final fun <get-BUBBLING_PHASE>(): kotlin.Short
        public final val CAPTURING_PHASE: kotlin.Short
            public final fun <get-CAPTURING_PHASE>(): kotlin.Short
        public final val NONE: kotlin.Short
            public final fun <get-NONE>(): kotlin.Short
        public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
        public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
        public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
    }
}

public external interface ClipboardEventInit : org.w3c.dom.EventInit {
    public open override /*1*/ /*fake_override*/ var bubbles: kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <get-bubbles>(): kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <set-bubbles>(/*0*/ value: kotlin.Boolean?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ var cancelable: kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <get-cancelable>(): kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <set-cancelable>(/*0*/ value: kotlin.Boolean?): kotlin.Unit
    public open var clipboardData: org.w3c.dom.DataTransfer?
        public open fun <get-clipboardData>(): org.w3c.dom.DataTransfer?
        public open fun <set-clipboardData>(/*0*/ value: org.w3c.dom.DataTransfer?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ var composed: kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <get-composed>(): kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <set-composed>(/*0*/ value: kotlin.Boolean?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

public open external class ClipboardItem {
    /*primary*/ public constructor ClipboardItem(/*0*/ items: kotlin.js.Promise<dynamic>, /*1*/ options: org.w3c.dom.clipboard.ClipboardItemOptions = ...)
    public open val delayed: kotlin.Boolean
        public open fun <get-delayed>(): kotlin.Boolean
    public open val lastModified: kotlin.Int
        public open fun <get-lastModified>(): kotlin.Int
    public open val presentationStyle: org.w3c.dom.clipboard.PresentationStyle
        public open fun <get-presentationStyle>(): org.w3c.dom.clipboard.PresentationStyle
    public open val types: kotlin.Array<out kotlin.String>
        public open fun <get-types>(): kotlin.Array<out kotlin.String>
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public final fun getType(/*0*/ type: kotlin.String): kotlin.js.Promise<org.w3c.files.Blob>
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String

    public companion object Companion {
        /*primary*/ private constructor Companion()
        public final fun createDelayed(/*0*/ items: () -> kotlin.js.Promise<dynamic>, /*1*/ options: org.w3c.dom.clipboard.ClipboardItemOptions = ...): org.w3c.dom.clipboard.ClipboardItem
        public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
        public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
        public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
    }
}

public external interface ClipboardItemOptions {
    public open var presentationStyle: org.w3c.dom.clipboard.PresentationStyle?
        public open fun <get-presentationStyle>(): org.w3c.dom.clipboard.PresentationStyle?
        public open fun <set-presentationStyle>(/*0*/ value: org.w3c.dom.clipboard.PresentationStyle?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

public external interface ClipboardPermissionDescriptor {
    public open var allowWithoutGesture: kotlin.Boolean?
        public open fun <get-allowWithoutGesture>(): kotlin.Boolean?
        public open fun <set-allowWithoutGesture>(/*0*/ value: kotlin.Boolean?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

@kotlin.Suppress(names = {"NESTED_CLASS_IN_EXTERNAL_INTERFACE"}) public external interface PresentationStyle {
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String

    public companion object Companion {
        /*primary*/ private constructor Companion()
        public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
        public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
        public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
    }
}

