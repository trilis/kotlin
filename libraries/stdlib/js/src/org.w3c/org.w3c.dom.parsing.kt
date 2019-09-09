/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

package org.w3c.dom.parsing

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.css.masking.*
import org.w3c.dom.*
import org.w3c.dom.clipboard.*
import org.w3c.dom.css.*
import org.w3c.dom.events.*
import org.w3c.dom.mediacapture.*
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

/**
 * Exposes the JavaScript [DOMParser](https://developer.mozilla.org/en/docs/Web/API/DOMParser) to Kotlin
 */
external open class DOMParser {
    fun parseFromString(str: String, type: SupportedType): Document
}

/**
 * Exposes the JavaScript [XMLSerializer](https://developer.mozilla.org/en/docs/Web/API/XMLSerializer) to Kotlin
 */
external open class XMLSerializer {
    fun serializeToString(root: Node): String
}

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface SupportedType {
    companion object
}

inline val SupportedType.Companion.TEXT/HTML: SupportedType get() = "text/html".asDynamic().unsafeCast<SupportedType>()

inline val SupportedType.Companion.TEXT/XML: SupportedType get() = "text/xml".asDynamic().unsafeCast<SupportedType>()

inline val SupportedType.Companion.APPLICATION/XML: SupportedType get() = "application/xml".asDynamic().unsafeCast<SupportedType>()

inline val SupportedType.Companion.APPLICATION/XHTML+XML: SupportedType get() = "application/xhtml+xml".asDynamic().unsafeCast<SupportedType>()

inline val SupportedType.Companion.IMAGE/SVG+XML: SupportedType get() = "image/svg+xml".asDynamic().unsafeCast<SupportedType>()