package org.w3c.dom.parsing

public val org.w3c.dom.parsing.SupportedType.Companion.APPLICATION: [ERROR : No type, no body]
    public inline fun org.w3c.dom.parsing.SupportedType.Companion.<get-APPLICATION>(): [ERROR : No type, no body]
public val org.w3c.dom.parsing.SupportedType.Companion.APPLICATION: [ERROR : No type, no body]
    public inline fun org.w3c.dom.parsing.SupportedType.Companion.<get-APPLICATION>(): [ERROR : No type, no body]
public val org.w3c.dom.parsing.SupportedType.Companion.IMAGE: [ERROR : No type, no body]
    public inline fun org.w3c.dom.parsing.SupportedType.Companion.<get-IMAGE>(): [ERROR : No type, no body]
public val org.w3c.dom.parsing.SupportedType.Companion.TEXT: [ERROR : No type, no body]
    public inline fun org.w3c.dom.parsing.SupportedType.Companion.<get-TEXT>(): [ERROR : No type, no body]
public val org.w3c.dom.parsing.SupportedType.Companion.TEXT: [ERROR : No type, no body]
    public inline fun org.w3c.dom.parsing.SupportedType.Companion.<get-TEXT>(): [ERROR : No type, no body]

public open external class DOMParser {
    /*primary*/ public constructor DOMParser()
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public final fun parseFromString(/*0*/ str: kotlin.String, /*1*/ type: org.w3c.dom.parsing.SupportedType): org.w3c.dom.Document
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

@kotlin.Suppress(names = {"NESTED_CLASS_IN_EXTERNAL_INTERFACE"}) public external interface SupportedType {
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

public open external class XMLSerializer {
    /*primary*/ public constructor XMLSerializer()
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public final fun serializeToString(/*0*/ root: org.w3c.dom.Node): kotlin.String
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

