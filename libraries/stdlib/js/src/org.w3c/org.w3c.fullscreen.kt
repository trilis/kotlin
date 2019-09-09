/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

package org.w3c.fullscreen

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.css.masking.*
import org.w3c.dom.*
import org.w3c.dom.clipboard.*
import org.w3c.dom.css.*
import org.w3c.dom.events.*
import org.w3c.dom.mediacapture.*
import org.w3c.dom.parsing.*
import org.w3c.dom.pointerevents.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface FullscreenOptions {
    var navigationUI: FullscreenNavigationUI? /* = FullscreenNavigationUI.AUTO */
        get() = definedExternally
        set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun FullscreenOptions(navigationUI: FullscreenNavigationUI? = FullscreenNavigationUI.AUTO): FullscreenOptions {
    val o = js("({})")
    o["navigationUI"] = navigationUI
    return o
}

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface FullscreenNavigationUI {
    companion object
}

inline val FullscreenNavigationUI.Companion.AUTO: FullscreenNavigationUI get() = "auto".asDynamic().unsafeCast<FullscreenNavigationUI>()

inline val FullscreenNavigationUI.Companion.SHOW: FullscreenNavigationUI get() = "show".asDynamic().unsafeCast<FullscreenNavigationUI>()

inline val FullscreenNavigationUI.Companion.HIDE: FullscreenNavigationUI get() = "hide".asDynamic().unsafeCast<FullscreenNavigationUI>()