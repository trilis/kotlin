/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

package org.w3c.dom.clipboard

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.css.masking.*
import org.w3c.dom.*
import org.w3c.dom.css.*
import org.w3c.dom.events.*
import org.w3c.dom.mediacapture.*
import org.w3c.dom.parsing.*
import org.w3c.dom.pointerevents.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.fullscreen.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface ClipboardEventInit : EventInit {
    var clipboardData: DataTransfer? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun ClipboardEventInit(clipboardData: DataTransfer? = null, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): ClipboardEventInit {
    val o = js("({})")
    o["clipboardData"] = clipboardData
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o
}

/**
 * Exposes the JavaScript [ClipboardEvent](https://developer.mozilla.org/en/docs/Web/API/ClipboardEvent) to Kotlin
 */
external open class ClipboardEvent(type: String, eventInitDict: ClipboardEventInit = definedExternally) : Event {
    open val clipboardData: DataTransfer?

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

/**
 * Exposes the JavaScript [Clipboard](https://developer.mozilla.org/en/docs/Web/API/Clipboard) to Kotlin
 */
external open class Clipboard : EventTarget {
    fun read(): Promise<Array<ClipboardItem>>
    fun readText(): Promise<String>
    fun write(data: Array<ClipboardItem>): Promise<Unit>
    fun writeText(data: String): Promise<Unit>
}

external open class ClipboardItem(items: Promise<dynamic>, options: ClipboardItemOptions = definedExternally) {
    open val presentationStyle: PresentationStyle
    open val lastModified: Int
    open val delayed: Boolean
    open val types: Array<out String>
    fun getType(type: String): Promise<Blob>

    companion object {
        fun createDelayed(items: () -> Promise<dynamic>, options: ClipboardItemOptions = definedExternally): ClipboardItem
    }
}

external interface ClipboardItemOptions {
    var presentationStyle: PresentationStyle? /* = PresentationStyle.UNSPECIFIED */
        get() = definedExternally
        set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun ClipboardItemOptions(presentationStyle: PresentationStyle? = PresentationStyle.UNSPECIFIED): ClipboardItemOptions {
    val o = js("({})")
    o["presentationStyle"] = presentationStyle
    return o
}

external interface ClipboardPermissionDescriptor {
    var allowWithoutGesture: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun ClipboardPermissionDescriptor(allowWithoutGesture: Boolean? = false): ClipboardPermissionDescriptor {
    val o = js("({})")
    o["allowWithoutGesture"] = allowWithoutGesture
    return o
}

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface PresentationStyle {
    companion object
}

inline val PresentationStyle.Companion.UNSPECIFIED: PresentationStyle get() = "unspecified".asDynamic().unsafeCast<PresentationStyle>()

inline val PresentationStyle.Companion.INLINE: PresentationStyle get() = "inline".asDynamic().unsafeCast<PresentationStyle>()

inline val PresentationStyle.Companion.ATTACHMENT: PresentationStyle get() = "attachment".asDynamic().unsafeCast<PresentationStyle>()