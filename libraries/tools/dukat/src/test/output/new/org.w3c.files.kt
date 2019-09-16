package org.w3c.files

public val org.w3c.files.EndingType.Companion.NATIVE: org.w3c.files.EndingType
    public inline fun org.w3c.files.EndingType.Companion.<get-NATIVE>(): org.w3c.files.EndingType
public val org.w3c.files.EndingType.Companion.TRANSPARENT: org.w3c.files.EndingType
    public inline fun org.w3c.files.EndingType.Companion.<get-TRANSPARENT>(): org.w3c.files.EndingType
@kotlin.internal.InlineOnly public inline fun BlobPropertyBag(/*0*/ type: kotlin.String? = ..., /*1*/ endings: org.w3c.files.EndingType? = ...): org.w3c.files.BlobPropertyBag
@kotlin.internal.InlineOnly public inline fun FilePropertyBag(/*0*/ lastModified: kotlin.Int? = ..., /*1*/ type: kotlin.String? = ..., /*2*/ endings: org.w3c.files.EndingType? = ...): org.w3c.files.FilePropertyBag
@kotlin.internal.InlineOnly public inline operator fun org.w3c.files.FileList.get(/*0*/ index: kotlin.Int): org.w3c.files.File?

public abstract external class Blob : org.w3c.dom.ImageBitmapSource {
    /*primary*/ public constructor Blob()
    public open val size: kotlin.Number
        public open fun <get-size>(): kotlin.Number
    public open val type: kotlin.String
        public open fun <get-type>(): kotlin.String
    public final fun arrayBuffer(): kotlin.js.Promise<org.khronos.webgl.ArrayBuffer>
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public final fun slice(/*0*/ start: kotlin.Int = ..., /*1*/ end: kotlin.Int = ..., /*2*/ contentType: kotlin.String = ...): org.w3c.files.Blob
    public final fun stream(): dynamic
    public final fun text(): kotlin.js.Promise<kotlin.String>
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

public external interface BlobPropertyBag {
    public open var endings: org.w3c.files.EndingType?
        public open fun <get-endings>(): org.w3c.files.EndingType?
        public open fun <set-endings>(/*0*/ value: org.w3c.files.EndingType?): kotlin.Unit
    public open var type: kotlin.String?
        public open fun <get-type>(): kotlin.String?
        public open fun <set-type>(/*0*/ value: kotlin.String?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

@kotlin.Suppress(names = {"NESTED_CLASS_IN_EXTERNAL_INTERFACE"}) public external interface EndingType {
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

public abstract external class File : org.w3c.files.Blob {
    /*primary*/ public constructor File()
    public open val lastModified: kotlin.Int
        public open fun <get-lastModified>(): kotlin.Int
    public open val name: kotlin.String
        public open fun <get-name>(): kotlin.String
    public open override /*1*/ /*fake_override*/ val size: kotlin.Number
        public open override /*1*/ /*fake_override*/ fun <get-size>(): kotlin.Number
    public open override /*1*/ /*fake_override*/ val type: kotlin.String
        public open override /*1*/ /*fake_override*/ fun <get-type>(): kotlin.String
    public final override /*1*/ /*fake_override*/ fun arrayBuffer(): kotlin.js.Promise<org.khronos.webgl.ArrayBuffer>
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public final override /*1*/ /*fake_override*/ fun slice(/*0*/ start: kotlin.Int = ..., /*1*/ end: kotlin.Int = ..., /*2*/ contentType: kotlin.String = ...): org.w3c.files.Blob
    public final override /*1*/ /*fake_override*/ fun stream(): dynamic
    public final override /*1*/ /*fake_override*/ fun text(): kotlin.js.Promise<kotlin.String>
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

public abstract external class FileList : org.w3c.dom.ItemArrayLike<org.w3c.files.File> {
    /*primary*/ public constructor FileList()
    public abstract override /*1*/ /*fake_override*/ val length: kotlin.Int
        public abstract override /*1*/ /*fake_override*/ fun <get-length>(): kotlin.Int
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public open override /*1*/ fun item(/*0*/ index: kotlin.Int): org.w3c.files.File?
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

public external interface FilePropertyBag : org.w3c.files.BlobPropertyBag {
    public open override /*1*/ /*fake_override*/ var endings: org.w3c.files.EndingType?
        public open override /*1*/ /*fake_override*/ fun <get-endings>(): org.w3c.files.EndingType?
        public open override /*1*/ /*fake_override*/ fun <set-endings>(/*0*/ value: org.w3c.files.EndingType?): kotlin.Unit
    public open var lastModified: kotlin.Int?
        public open fun <get-lastModified>(): kotlin.Int?
        public open fun <set-lastModified>(/*0*/ value: kotlin.Int?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ var type: kotlin.String?
        public open override /*1*/ /*fake_override*/ fun <get-type>(): kotlin.String?
        public open override /*1*/ /*fake_override*/ fun <set-type>(/*0*/ value: kotlin.String?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

public open external class FileReader : org.w3c.dom.events.EventTarget {
    /*primary*/ public constructor FileReader()
    public open val error: dynamic
        public open fun <get-error>(): dynamic
    public final var onabort: ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <get-onabort>(): ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <set-onabort>(/*0*/ <set-?>: ((org.w3c.dom.events.Event) -> dynamic)?): kotlin.Unit
    public final var onerror: ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <get-onerror>(): ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <set-onerror>(/*0*/ <set-?>: ((org.w3c.dom.events.Event) -> dynamic)?): kotlin.Unit
    public final var onload: ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <get-onload>(): ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <set-onload>(/*0*/ <set-?>: ((org.w3c.dom.events.Event) -> dynamic)?): kotlin.Unit
    public final var onloadend: ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <get-onloadend>(): ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <set-onloadend>(/*0*/ <set-?>: ((org.w3c.dom.events.Event) -> dynamic)?): kotlin.Unit
    public final var onloadstart: ((org.w3c.xhr.ProgressEvent) -> dynamic)?
        public final fun <get-onloadstart>(): ((org.w3c.xhr.ProgressEvent) -> dynamic)?
        public final fun <set-onloadstart>(/*0*/ <set-?>: ((org.w3c.xhr.ProgressEvent) -> dynamic)?): kotlin.Unit
    public final var onprogress: ((org.w3c.xhr.ProgressEvent) -> dynamic)?
        public final fun <get-onprogress>(): ((org.w3c.xhr.ProgressEvent) -> dynamic)?
        public final fun <set-onprogress>(/*0*/ <set-?>: ((org.w3c.xhr.ProgressEvent) -> dynamic)?): kotlin.Unit
    public open val readyState: kotlin.Short
        public open fun <get-readyState>(): kotlin.Short
    public open val result: dynamic
        public open fun <get-result>(): dynamic
    public final fun abort(): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun addEventListener(/*0*/ type: kotlin.String, /*1*/ callback: ((org.w3c.dom.events.Event) -> kotlin.Unit)?, /*2*/ options: dynamic = ...): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun addEventListener(/*0*/ type: kotlin.String, /*1*/ callback: org.w3c.dom.events.EventListener?, /*2*/ options: dynamic = ...): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun dispatchEvent(/*0*/ event: org.w3c.dom.events.Event): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public final fun readAsArrayBuffer(/*0*/ blob: org.w3c.files.Blob): kotlin.Unit
    public final fun readAsBinaryString(/*0*/ blob: org.w3c.files.Blob): kotlin.Unit
    public final fun readAsDataURL(/*0*/ blob: org.w3c.files.Blob): kotlin.Unit
    public final fun readAsText(/*0*/ blob: org.w3c.files.Blob, /*1*/ encoding: kotlin.String = ...): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun removeEventListener(/*0*/ type: kotlin.String, /*1*/ callback: ((org.w3c.dom.events.Event) -> kotlin.Unit)?, /*2*/ options: dynamic = ...): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun removeEventListener(/*0*/ type: kotlin.String, /*1*/ callback: org.w3c.dom.events.EventListener?, /*2*/ options: dynamic = ...): kotlin.Unit
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String

    public companion object Companion {
        /*primary*/ private constructor Companion()
        public final val DONE: kotlin.Short
            public final fun <get-DONE>(): kotlin.Short
        public final val EMPTY: kotlin.Short
            public final fun <get-EMPTY>(): kotlin.Short
        public final val LOADING: kotlin.Short
            public final fun <get-LOADING>(): kotlin.Short
        public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
        public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
        public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
    }
}

public abstract external class FileReaderSync {
    /*primary*/ public constructor FileReaderSync()
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public final fun readAsArrayBuffer(/*0*/ blob: org.w3c.files.Blob): org.khronos.webgl.ArrayBuffer
    public final fun readAsBinaryString(/*0*/ blob: org.w3c.files.Blob): kotlin.String
    public final fun readAsDataURL(/*0*/ blob: org.w3c.files.Blob): kotlin.String
    public final fun readAsText(/*0*/ blob: org.w3c.files.Blob, /*1*/ encoding: kotlin.String = ...): kotlin.String
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

