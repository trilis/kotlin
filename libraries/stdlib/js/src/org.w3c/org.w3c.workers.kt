/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

package org.w3c.workers

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
import org.w3c.fullscreen.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.xhr.*

/**
 * Exposes the JavaScript [ServiceWorker](https://developer.mozilla.org/en/docs/Web/API/ServiceWorker) to Kotlin
 */
external open class ServiceWorker : EventTarget, MessageEventSource, UnionClientOrMessagePortOrServiceWorker {
    open val scriptURL: String
    open val state: ServiceWorkerState
    var onstatechange: ((Event) -> dynamic)?
    var onerror: ((Event) -> dynamic)?
    fun postMessage(message: Any?, transfer: Array<dynamic>)
    fun postMessage(message: Any?, options: PostMessageOptions = definedExternally)
}

/**
 * Exposes the JavaScript [ServiceWorkerRegistration](https://developer.mozilla.org/en/docs/Web/API/ServiceWorkerRegistration) to Kotlin
 */
external open class ServiceWorkerRegistration : EventTarget {
    open val installing: ServiceWorker?
    open val waiting: ServiceWorker?
    open val active: ServiceWorker?
    open val navigationPreload: NavigationPreloadManager
    open val scope: String
    open val updateViaCache: ServiceWorkerUpdateViaCache
    var onupdatefound: ((Event) -> dynamic)?
    fun update(): Promise<Unit>
    fun unregister(): Promise<Boolean>
    fun showNotification(title: String, options: NotificationOptions = definedExternally): Promise<Unit>
    fun getNotifications(filter: GetNotificationOptions = definedExternally): Promise<Array<Notification>>
}

/**
 * Exposes the JavaScript [ServiceWorkerContainer](https://developer.mozilla.org/en/docs/Web/API/ServiceWorkerContainer) to Kotlin
 */
external open class ServiceWorkerContainer : EventTarget {
    open val controller: ServiceWorker?
    open val ready: Promise<ServiceWorkerRegistration>
    var oncontrollerchange: ((Event) -> dynamic)?
    var onmessage: ((MessageEvent) -> dynamic)?
    var onmessageerror: ((Event) -> dynamic)?
    fun register(scriptURL: String, options: RegistrationOptions = definedExternally): Promise<ServiceWorkerRegistration>
    fun getRegistration(clientURL: String = definedExternally): Promise<Any?>
    fun getRegistrations(): Promise<Array<out ServiceWorkerRegistration>>
    fun startMessages()
}

external interface RegistrationOptions {
    var scope: String?
        get() = definedExternally
        set(value) = definedExternally
    var type: WorkerType? /* = WorkerType.CLASSIC */
        get() = definedExternally
        set(value) = definedExternally
    var updateViaCache: ServiceWorkerUpdateViaCache? /* = ServiceWorkerUpdateViaCache.IMPORTS */
        get() = definedExternally
        set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun RegistrationOptions(scope: String? = undefined, type: WorkerType? = WorkerType.CLASSIC, updateViaCache: ServiceWorkerUpdateViaCache? = ServiceWorkerUpdateViaCache.IMPORTS): RegistrationOptions {
    val o = js("({})")
    o["scope"] = scope
    o["type"] = type
    o["updateViaCache"] = updateViaCache
    return o
}

external abstract class NavigationPreloadManager {
    fun enable(): Promise<Unit>
    fun disable(): Promise<Unit>
    fun setHeaderValue(value: String): Promise<Unit>
    fun getState(): Promise<NavigationPreloadState>
}

external interface NavigationPreloadState {
    var enabled: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var headerValue: String?
        get() = definedExternally
        set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun NavigationPreloadState(enabled: Boolean? = false, headerValue: String? = undefined): NavigationPreloadState {
    val o = js("({})")
    o["enabled"] = enabled
    o["headerValue"] = headerValue
    return o
}

/**
 * Exposes the JavaScript [ServiceWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/ServiceWorkerGlobalScope) to Kotlin
 */
external open class ServiceWorkerGlobalScope : WorkerGlobalScope {
    open val clients: Clients
    open val registration: ServiceWorkerRegistration
    open val serviceWorker: ServiceWorker
    var oninstall: ((Event) -> dynamic)?
    var onactivate: ((Event) -> dynamic)?
    var onfetch: ((FetchEvent) -> dynamic)?
    var onmessage: ((MessageEvent) -> dynamic)?
    var onmessageerror: ((Event) -> dynamic)?
    var onnotificationclick: ((NotificationEvent) -> dynamic)?
    var onnotificationclose: ((NotificationEvent) -> dynamic)?
    fun skipWaiting(): Promise<Unit>
}

/**
 * Exposes the JavaScript [Client](https://developer.mozilla.org/en/docs/Web/API/Client) to Kotlin
 */
external abstract class Client : UnionClientOrMessagePortOrServiceWorker {
    open val url: String
    open val frameType: FrameType
    open val id: String
    open val type: ClientType
    fun postMessage(message: Any?, transfer: Array<dynamic>)
    fun postMessage(message: Any?, options: PostMessageOptions = definedExternally)
}

/**
 * Exposes the JavaScript [WindowClient](https://developer.mozilla.org/en/docs/Web/API/WindowClient) to Kotlin
 */
external abstract class WindowClient : Client {
    open val visibilityState: dynamic
    open val focused: Boolean
    open val ancestorOrigins: Array<out String>
    fun focus(): Promise<WindowClient>
    fun navigate(url: String): Promise<WindowClient?>
}

/**
 * Exposes the JavaScript [Clients](https://developer.mozilla.org/en/docs/Web/API/Clients) to Kotlin
 */
external abstract class Clients {
    fun get(id: String): Promise<Any?>
    fun matchAll(options: ClientQueryOptions = definedExternally): Promise<Array<out Client>>
    fun openWindow(url: String): Promise<WindowClient?>
    fun claim(): Promise<Unit>
}

external interface ClientQueryOptions {
    var includeUncontrolled: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var type: ClientType? /* = ClientType.WINDOW */
        get() = definedExternally
        set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun ClientQueryOptions(includeUncontrolled: Boolean? = false, type: ClientType? = ClientType.WINDOW): ClientQueryOptions {
    val o = js("({})")
    o["includeUncontrolled"] = includeUncontrolled
    o["type"] = type
    return o
}

/**
 * Exposes the JavaScript [ExtendableEvent](https://developer.mozilla.org/en/docs/Web/API/ExtendableEvent) to Kotlin
 */
external open class ExtendableEvent : Event {
    fun waitUntil(f: Promise<Any?>)

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

external interface ExtendableEventInit : EventInit

@kotlin.internal.InlineOnly
inline fun ExtendableEventInit(bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): ExtendableEventInit {
    val o = js("({})")
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o
}

/**
 * Exposes the JavaScript [FetchEvent](https://developer.mozilla.org/en/docs/Web/API/FetchEvent) to Kotlin
 */
external open class FetchEvent : ExtendableEvent {
    open val request: Request
    open val preloadResponse: Promise<Any?>
    open val clientId: String
    open val resultingClientId: String
    open val replacesClientId: String
    fun respondWith(r: Promise<Response>)

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

external interface FetchEventInit : ExtendableEventInit {
    var request: Request?
        get() = definedExternally
        set(value) = definedExternally
    var preloadResponse: Promise<Any?>?
        get() = definedExternally
        set(value) = definedExternally
    var clientId: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    var resultingClientId: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    var replacesClientId: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun FetchEventInit(request: Request?, preloadResponse: Promise<Any?>? = undefined, clientId: String? = "", resultingClientId: String? = "", replacesClientId: String? = "", bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): FetchEventInit {
    val o = js("({})")
    o["request"] = request
    o["preloadResponse"] = preloadResponse
    o["clientId"] = clientId
    o["resultingClientId"] = resultingClientId
    o["replacesClientId"] = replacesClientId
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o
}

/**
 * Exposes the JavaScript [ExtendableMessageEvent](https://developer.mozilla.org/en/docs/Web/API/ExtendableMessageEvent) to Kotlin
 */
external open class ExtendableMessageEvent : ExtendableEvent {
    open val data: Any?
    open val origin: String
    open val lastEventId: String
    open val source: UnionClientOrMessagePortOrServiceWorker?
    open val ports: Array<out MessagePort>

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

external interface ExtendableMessageEventInit : ExtendableEventInit {
    var data: Any? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    var origin: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    var lastEventId: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    var source: UnionClientOrMessagePortOrServiceWorker? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    var ports: Array<MessagePort>? /* = arrayOf() */
        get() = definedExternally
        set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun ExtendableMessageEventInit(data: Any? = null, origin: String? = "", lastEventId: String? = "", source: UnionClientOrMessagePortOrServiceWorker? = null, ports: Array<MessagePort>? = arrayOf(), bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): ExtendableMessageEventInit {
    val o = js("({})")
    o["data"] = data
    o["origin"] = origin
    o["lastEventId"] = lastEventId
    o["source"] = source
    o["ports"] = ports
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o
}

/**
 * Exposes the JavaScript [Cache](https://developer.mozilla.org/en/docs/Web/API/Cache) to Kotlin
 */
external abstract class Cache {
    fun match(request: dynamic, options: CacheQueryOptions = definedExternally): Promise<Any?>
    fun matchAll(request: dynamic = definedExternally, options: CacheQueryOptions = definedExternally): Promise<Array<out Response>>
    fun add(request: dynamic): Promise<Unit>
    fun addAll(requests: Array<dynamic>): Promise<Unit>
    fun put(request: dynamic, response: Response): Promise<Unit>
    fun delete(request: dynamic, options: CacheQueryOptions = definedExternally): Promise<Boolean>
    fun keys(request: dynamic = definedExternally, options: CacheQueryOptions = definedExternally): Promise<Array<out Request>>
}

external interface CacheQueryOptions {
    var ignoreSearch: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var ignoreMethod: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var ignoreVary: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun CacheQueryOptions(ignoreSearch: Boolean? = false, ignoreMethod: Boolean? = false, ignoreVary: Boolean? = false): CacheQueryOptions {
    val o = js("({})")
    o["ignoreSearch"] = ignoreSearch
    o["ignoreMethod"] = ignoreMethod
    o["ignoreVary"] = ignoreVary
    return o
}

/**
 * Exposes the JavaScript [CacheStorage](https://developer.mozilla.org/en/docs/Web/API/CacheStorage) to Kotlin
 */
external abstract class CacheStorage {
    fun match(request: dynamic, options: MultiCacheQueryOptions = definedExternally): Promise<Any?>
    fun has(cacheName: String): Promise<Boolean>
    fun open(cacheName: String): Promise<Cache>
    fun delete(cacheName: String): Promise<Boolean>
    fun keys(): Promise<Array<String>>
}

external interface MultiCacheQueryOptions : CacheQueryOptions {
    var cacheName: String?
        get() = definedExternally
        set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun MultiCacheQueryOptions(cacheName: String? = undefined, ignoreSearch: Boolean? = false, ignoreMethod: Boolean? = false, ignoreVary: Boolean? = false): MultiCacheQueryOptions {
    val o = js("({})")
    o["cacheName"] = cacheName
    o["ignoreSearch"] = ignoreSearch
    o["ignoreMethod"] = ignoreMethod
    o["ignoreVary"] = ignoreVary
    return o
}

external interface UnionClientOrMessagePortOrServiceWorker

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface ServiceWorkerState {
    companion object
}

inline val ServiceWorkerState.Companion.PARSED: ServiceWorkerState get() = "parsed".asDynamic().unsafeCast<ServiceWorkerState>()

inline val ServiceWorkerState.Companion.INSTALLING: ServiceWorkerState get() = "installing".asDynamic().unsafeCast<ServiceWorkerState>()

inline val ServiceWorkerState.Companion.INSTALLED: ServiceWorkerState get() = "installed".asDynamic().unsafeCast<ServiceWorkerState>()

inline val ServiceWorkerState.Companion.ACTIVATING: ServiceWorkerState get() = "activating".asDynamic().unsafeCast<ServiceWorkerState>()

inline val ServiceWorkerState.Companion.ACTIVATED: ServiceWorkerState get() = "activated".asDynamic().unsafeCast<ServiceWorkerState>()

inline val ServiceWorkerState.Companion.REDUNDANT: ServiceWorkerState get() = "redundant".asDynamic().unsafeCast<ServiceWorkerState>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface ServiceWorkerUpdateViaCache {
    companion object
}

inline val ServiceWorkerUpdateViaCache.Companion.IMPORTS: ServiceWorkerUpdateViaCache get() = "imports".asDynamic().unsafeCast<ServiceWorkerUpdateViaCache>()

inline val ServiceWorkerUpdateViaCache.Companion.ALL: ServiceWorkerUpdateViaCache get() = "all".asDynamic().unsafeCast<ServiceWorkerUpdateViaCache>()

inline val ServiceWorkerUpdateViaCache.Companion.NONE: ServiceWorkerUpdateViaCache get() = "none".asDynamic().unsafeCast<ServiceWorkerUpdateViaCache>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface FrameType {
    companion object
}

inline val FrameType.Companion.AUXILIARY: FrameType get() = "auxiliary".asDynamic().unsafeCast<FrameType>()

inline val FrameType.Companion.TOP_LEVEL: FrameType get() = "top-level".asDynamic().unsafeCast<FrameType>()

inline val FrameType.Companion.NESTED: FrameType get() = "nested".asDynamic().unsafeCast<FrameType>()

inline val FrameType.Companion.NONE: FrameType get() = "none".asDynamic().unsafeCast<FrameType>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface ClientType {
    companion object
}

inline val ClientType.Companion.WINDOW: ClientType get() = "window".asDynamic().unsafeCast<ClientType>()

inline val ClientType.Companion.WORKER: ClientType get() = "worker".asDynamic().unsafeCast<ClientType>()

inline val ClientType.Companion.SHAREDWORKER: ClientType get() = "sharedworker".asDynamic().unsafeCast<ClientType>()

inline val ClientType.Companion.ALL: ClientType get() = "all".asDynamic().unsafeCast<ClientType>()