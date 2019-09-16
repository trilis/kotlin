package org.w3c.workers

public val org.w3c.workers.ServiceWorkerState.Companion.ACTIVATED: org.w3c.workers.ServiceWorkerState
    public inline fun org.w3c.workers.ServiceWorkerState.Companion.<get-ACTIVATED>(): org.w3c.workers.ServiceWorkerState
public val org.w3c.workers.ServiceWorkerState.Companion.ACTIVATING: org.w3c.workers.ServiceWorkerState
    public inline fun org.w3c.workers.ServiceWorkerState.Companion.<get-ACTIVATING>(): org.w3c.workers.ServiceWorkerState
public val org.w3c.workers.ClientType.Companion.ALL: org.w3c.workers.ClientType
    public inline fun org.w3c.workers.ClientType.Companion.<get-ALL>(): org.w3c.workers.ClientType
public val org.w3c.workers.ServiceWorkerUpdateViaCache.Companion.ALL: org.w3c.workers.ServiceWorkerUpdateViaCache
    public inline fun org.w3c.workers.ServiceWorkerUpdateViaCache.Companion.<get-ALL>(): org.w3c.workers.ServiceWorkerUpdateViaCache
public val org.w3c.workers.FrameType.Companion.AUXILIARY: org.w3c.workers.FrameType
    public inline fun org.w3c.workers.FrameType.Companion.<get-AUXILIARY>(): org.w3c.workers.FrameType
public val org.w3c.workers.ServiceWorkerUpdateViaCache.Companion.IMPORTS: org.w3c.workers.ServiceWorkerUpdateViaCache
    public inline fun org.w3c.workers.ServiceWorkerUpdateViaCache.Companion.<get-IMPORTS>(): org.w3c.workers.ServiceWorkerUpdateViaCache
public val org.w3c.workers.ServiceWorkerState.Companion.INSTALLED: org.w3c.workers.ServiceWorkerState
    public inline fun org.w3c.workers.ServiceWorkerState.Companion.<get-INSTALLED>(): org.w3c.workers.ServiceWorkerState
public val org.w3c.workers.ServiceWorkerState.Companion.INSTALLING: org.w3c.workers.ServiceWorkerState
    public inline fun org.w3c.workers.ServiceWorkerState.Companion.<get-INSTALLING>(): org.w3c.workers.ServiceWorkerState
public val org.w3c.workers.FrameType.Companion.NESTED: org.w3c.workers.FrameType
    public inline fun org.w3c.workers.FrameType.Companion.<get-NESTED>(): org.w3c.workers.FrameType
public val org.w3c.workers.FrameType.Companion.NONE: org.w3c.workers.FrameType
    public inline fun org.w3c.workers.FrameType.Companion.<get-NONE>(): org.w3c.workers.FrameType
public val org.w3c.workers.ServiceWorkerUpdateViaCache.Companion.NONE: org.w3c.workers.ServiceWorkerUpdateViaCache
    public inline fun org.w3c.workers.ServiceWorkerUpdateViaCache.Companion.<get-NONE>(): org.w3c.workers.ServiceWorkerUpdateViaCache
public val org.w3c.workers.ServiceWorkerState.Companion.PARSED: org.w3c.workers.ServiceWorkerState
    public inline fun org.w3c.workers.ServiceWorkerState.Companion.<get-PARSED>(): org.w3c.workers.ServiceWorkerState
public val org.w3c.workers.ServiceWorkerState.Companion.REDUNDANT: org.w3c.workers.ServiceWorkerState
    public inline fun org.w3c.workers.ServiceWorkerState.Companion.<get-REDUNDANT>(): org.w3c.workers.ServiceWorkerState
public val org.w3c.workers.ClientType.Companion.SHAREDWORKER: org.w3c.workers.ClientType
    public inline fun org.w3c.workers.ClientType.Companion.<get-SHAREDWORKER>(): org.w3c.workers.ClientType
public val org.w3c.workers.FrameType.Companion.TOP_LEVEL: org.w3c.workers.FrameType
    public inline fun org.w3c.workers.FrameType.Companion.<get-TOP_LEVEL>(): org.w3c.workers.FrameType
public val org.w3c.workers.ClientType.Companion.WINDOW: org.w3c.workers.ClientType
    public inline fun org.w3c.workers.ClientType.Companion.<get-WINDOW>(): org.w3c.workers.ClientType
public val org.w3c.workers.ClientType.Companion.WORKER: org.w3c.workers.ClientType
    public inline fun org.w3c.workers.ClientType.Companion.<get-WORKER>(): org.w3c.workers.ClientType
@kotlin.internal.InlineOnly public inline fun CacheQueryOptions(/*0*/ ignoreSearch: kotlin.Boolean? = ..., /*1*/ ignoreMethod: kotlin.Boolean? = ..., /*2*/ ignoreVary: kotlin.Boolean? = ...): org.w3c.workers.CacheQueryOptions
@kotlin.internal.InlineOnly public inline fun ClientQueryOptions(/*0*/ includeUncontrolled: kotlin.Boolean? = ..., /*1*/ type: org.w3c.workers.ClientType? = ...): org.w3c.workers.ClientQueryOptions
@kotlin.internal.InlineOnly public inline fun ExtendableEventInit(/*0*/ bubbles: kotlin.Boolean? = ..., /*1*/ cancelable: kotlin.Boolean? = ..., /*2*/ composed: kotlin.Boolean? = ...): org.w3c.workers.ExtendableEventInit
@kotlin.internal.InlineOnly public inline fun ExtendableMessageEventInit(/*0*/ data: kotlin.Any? = ..., /*1*/ origin: kotlin.String? = ..., /*2*/ lastEventId: kotlin.String? = ..., /*3*/ source: org.w3c.workers.UnionClientOrMessagePortOrServiceWorker? = ..., /*4*/ ports: kotlin.Array<org.w3c.dom.MessagePort>? = ..., /*5*/ bubbles: kotlin.Boolean? = ..., /*6*/ cancelable: kotlin.Boolean? = ..., /*7*/ composed: kotlin.Boolean? = ...): org.w3c.workers.ExtendableMessageEventInit
@kotlin.internal.InlineOnly public inline fun FetchEventInit(/*0*/ request: org.w3c.fetch.Request?, /*1*/ preloadResponse: kotlin.js.Promise<kotlin.Any?>? = ..., /*2*/ clientId: kotlin.String? = ..., /*3*/ resultingClientId: kotlin.String? = ..., /*4*/ replacesClientId: kotlin.String? = ..., /*5*/ bubbles: kotlin.Boolean? = ..., /*6*/ cancelable: kotlin.Boolean? = ..., /*7*/ composed: kotlin.Boolean? = ...): org.w3c.workers.FetchEventInit
@kotlin.internal.InlineOnly public inline fun MultiCacheQueryOptions(/*0*/ cacheName: kotlin.String? = ..., /*1*/ ignoreSearch: kotlin.Boolean? = ..., /*2*/ ignoreMethod: kotlin.Boolean? = ..., /*3*/ ignoreVary: kotlin.Boolean? = ...): org.w3c.workers.MultiCacheQueryOptions
@kotlin.internal.InlineOnly public inline fun NavigationPreloadState(/*0*/ enabled: kotlin.Boolean? = ..., /*1*/ headerValue: kotlin.String? = ...): org.w3c.workers.NavigationPreloadState
@kotlin.internal.InlineOnly public inline fun RegistrationOptions(/*0*/ scope: kotlin.String? = ..., /*1*/ type: org.w3c.dom.WorkerType? = ..., /*2*/ updateViaCache: org.w3c.workers.ServiceWorkerUpdateViaCache? = ...): org.w3c.workers.RegistrationOptions

public abstract external class Cache {
    /*primary*/ public constructor Cache()
    public final fun add(/*0*/ request: dynamic): kotlin.js.Promise<kotlin.Unit>
    public final fun addAll(/*0*/ requests: kotlin.Array<dynamic>): kotlin.js.Promise<kotlin.Unit>
    public final fun delete(/*0*/ request: dynamic, /*1*/ options: org.w3c.workers.CacheQueryOptions = ...): kotlin.js.Promise<kotlin.Boolean>
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public final fun keys(/*0*/ request: dynamic = ..., /*1*/ options: org.w3c.workers.CacheQueryOptions = ...): kotlin.js.Promise<kotlin.Array<out org.w3c.fetch.Request>>
    public final fun match(/*0*/ request: dynamic, /*1*/ options: org.w3c.workers.CacheQueryOptions = ...): kotlin.js.Promise<kotlin.Any?>
    public final fun matchAll(/*0*/ request: dynamic = ..., /*1*/ options: org.w3c.workers.CacheQueryOptions = ...): kotlin.js.Promise<kotlin.Array<out org.w3c.fetch.Response>>
    public final fun put(/*0*/ request: dynamic, /*1*/ response: org.w3c.fetch.Response): kotlin.js.Promise<kotlin.Unit>
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

public external interface CacheQueryOptions {
    public open var ignoreMethod: kotlin.Boolean?
        public open fun <get-ignoreMethod>(): kotlin.Boolean?
        public open fun <set-ignoreMethod>(/*0*/ value: kotlin.Boolean?): kotlin.Unit
    public open var ignoreSearch: kotlin.Boolean?
        public open fun <get-ignoreSearch>(): kotlin.Boolean?
        public open fun <set-ignoreSearch>(/*0*/ value: kotlin.Boolean?): kotlin.Unit
    public open var ignoreVary: kotlin.Boolean?
        public open fun <get-ignoreVary>(): kotlin.Boolean?
        public open fun <set-ignoreVary>(/*0*/ value: kotlin.Boolean?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

public abstract external class CacheStorage {
    /*primary*/ public constructor CacheStorage()
    public final fun delete(/*0*/ cacheName: kotlin.String): kotlin.js.Promise<kotlin.Boolean>
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public final fun has(/*0*/ cacheName: kotlin.String): kotlin.js.Promise<kotlin.Boolean>
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public final fun keys(): kotlin.js.Promise<kotlin.Array<kotlin.String>>
    public final fun match(/*0*/ request: dynamic, /*1*/ options: org.w3c.workers.MultiCacheQueryOptions = ...): kotlin.js.Promise<kotlin.Any?>
    public final fun open(/*0*/ cacheName: kotlin.String): kotlin.js.Promise<org.w3c.workers.Cache>
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

public abstract external class Client : org.w3c.workers.UnionClientOrMessagePortOrServiceWorker {
    /*primary*/ public constructor Client()
    public open val frameType: org.w3c.workers.FrameType
        public open fun <get-frameType>(): org.w3c.workers.FrameType
    public open val id: kotlin.String
        public open fun <get-id>(): kotlin.String
    public open val type: org.w3c.workers.ClientType
        public open fun <get-type>(): org.w3c.workers.ClientType
    public open val url: kotlin.String
        public open fun <get-url>(): kotlin.String
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public final fun postMessage(/*0*/ message: kotlin.Any?, /*1*/ options: [ERROR : PostMessageOptions] = ...): kotlin.Unit
    public final fun postMessage(/*0*/ message: kotlin.Any?, /*1*/ transfer: kotlin.Array<dynamic>): kotlin.Unit
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

public external interface ClientQueryOptions {
    public open var includeUncontrolled: kotlin.Boolean?
        public open fun <get-includeUncontrolled>(): kotlin.Boolean?
        public open fun <set-includeUncontrolled>(/*0*/ value: kotlin.Boolean?): kotlin.Unit
    public open var type: org.w3c.workers.ClientType?
        public open fun <get-type>(): org.w3c.workers.ClientType?
        public open fun <set-type>(/*0*/ value: org.w3c.workers.ClientType?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

@kotlin.Suppress(names = {"NESTED_CLASS_IN_EXTERNAL_INTERFACE"}) public external interface ClientType {
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

public abstract external class Clients {
    /*primary*/ public constructor Clients()
    public final fun claim(): kotlin.js.Promise<kotlin.Unit>
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public final fun get(/*0*/ id: kotlin.String): kotlin.js.Promise<kotlin.Any?>
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public final fun matchAll(/*0*/ options: org.w3c.workers.ClientQueryOptions = ...): kotlin.js.Promise<kotlin.Array<out org.w3c.workers.Client>>
    public final fun openWindow(/*0*/ url: kotlin.String): kotlin.js.Promise<org.w3c.workers.WindowClient?>
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

public open external class ExtendableEvent : org.w3c.dom.events.Event {
    /*primary*/ public constructor ExtendableEvent()
    public open override /*1*/ /*fake_override*/ val bubbles: kotlin.Boolean
        public open override /*1*/ /*fake_override*/ fun <get-bubbles>(): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ val cancelable: kotlin.Boolean
        public open override /*1*/ /*fake_override*/ fun <get-cancelable>(): kotlin.Boolean
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
    public final fun waitUntil(/*0*/ f: kotlin.js.Promise<kotlin.Any?>): kotlin.Unit

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

public external interface ExtendableEventInit : org.w3c.dom.EventInit {
    public open override /*1*/ /*fake_override*/ var bubbles: kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <get-bubbles>(): kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <set-bubbles>(/*0*/ value: kotlin.Boolean?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ var cancelable: kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <get-cancelable>(): kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <set-cancelable>(/*0*/ value: kotlin.Boolean?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ var composed: kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <get-composed>(): kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <set-composed>(/*0*/ value: kotlin.Boolean?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

public open external class ExtendableMessageEvent : org.w3c.workers.ExtendableEvent {
    /*primary*/ public constructor ExtendableMessageEvent()
    public open override /*1*/ /*fake_override*/ val bubbles: kotlin.Boolean
        public open override /*1*/ /*fake_override*/ fun <get-bubbles>(): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ val cancelable: kotlin.Boolean
        public open override /*1*/ /*fake_override*/ fun <get-cancelable>(): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ val composed: kotlin.Boolean
        public open override /*1*/ /*fake_override*/ fun <get-composed>(): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ val currentTarget: org.w3c.dom.events.EventTarget?
        public open override /*1*/ /*fake_override*/ fun <get-currentTarget>(): org.w3c.dom.events.EventTarget?
    public open val data: kotlin.Any?
        public open fun <get-data>(): kotlin.Any?
    public open override /*1*/ /*fake_override*/ val defaultPrevented: kotlin.Boolean
        public open override /*1*/ /*fake_override*/ fun <get-defaultPrevented>(): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ val eventPhase: kotlin.Short
        public open override /*1*/ /*fake_override*/ fun <get-eventPhase>(): kotlin.Short
    public open override /*1*/ /*fake_override*/ val isTrusted: kotlin.Boolean
        public open override /*1*/ /*fake_override*/ fun <get-isTrusted>(): kotlin.Boolean
    public open val lastEventId: kotlin.String
        public open fun <get-lastEventId>(): kotlin.String
    public open val origin: kotlin.String
        public open fun <get-origin>(): kotlin.String
    public open val ports: kotlin.Array<out org.w3c.dom.MessagePort>
        public open fun <get-ports>(): kotlin.Array<out org.w3c.dom.MessagePort>
    public open val source: org.w3c.workers.UnionClientOrMessagePortOrServiceWorker?
        public open fun <get-source>(): org.w3c.workers.UnionClientOrMessagePortOrServiceWorker?
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
    public final override /*1*/ /*fake_override*/ fun waitUntil(/*0*/ f: kotlin.js.Promise<kotlin.Any?>): kotlin.Unit

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

public external interface ExtendableMessageEventInit : org.w3c.workers.ExtendableEventInit {
    public open override /*1*/ /*fake_override*/ var bubbles: kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <get-bubbles>(): kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <set-bubbles>(/*0*/ value: kotlin.Boolean?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ var cancelable: kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <get-cancelable>(): kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <set-cancelable>(/*0*/ value: kotlin.Boolean?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ var composed: kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <get-composed>(): kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <set-composed>(/*0*/ value: kotlin.Boolean?): kotlin.Unit
    public open var data: kotlin.Any?
        public open fun <get-data>(): kotlin.Any?
        public open fun <set-data>(/*0*/ value: kotlin.Any?): kotlin.Unit
    public open var lastEventId: kotlin.String?
        public open fun <get-lastEventId>(): kotlin.String?
        public open fun <set-lastEventId>(/*0*/ value: kotlin.String?): kotlin.Unit
    public open var origin: kotlin.String?
        public open fun <get-origin>(): kotlin.String?
        public open fun <set-origin>(/*0*/ value: kotlin.String?): kotlin.Unit
    public open var ports: kotlin.Array<org.w3c.dom.MessagePort>?
        public open fun <get-ports>(): kotlin.Array<org.w3c.dom.MessagePort>?
        public open fun <set-ports>(/*0*/ value: kotlin.Array<org.w3c.dom.MessagePort>?): kotlin.Unit
    public open var source: org.w3c.workers.UnionClientOrMessagePortOrServiceWorker?
        public open fun <get-source>(): org.w3c.workers.UnionClientOrMessagePortOrServiceWorker?
        public open fun <set-source>(/*0*/ value: org.w3c.workers.UnionClientOrMessagePortOrServiceWorker?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

public open external class FetchEvent : org.w3c.workers.ExtendableEvent {
    /*primary*/ public constructor FetchEvent()
    public open override /*1*/ /*fake_override*/ val bubbles: kotlin.Boolean
        public open override /*1*/ /*fake_override*/ fun <get-bubbles>(): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ val cancelable: kotlin.Boolean
        public open override /*1*/ /*fake_override*/ fun <get-cancelable>(): kotlin.Boolean
    public open val clientId: kotlin.String
        public open fun <get-clientId>(): kotlin.String
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
    public open val preloadResponse: kotlin.js.Promise<kotlin.Any?>
        public open fun <get-preloadResponse>(): kotlin.js.Promise<kotlin.Any?>
    public open val replacesClientId: kotlin.String
        public open fun <get-replacesClientId>(): kotlin.String
    public open val request: org.w3c.fetch.Request
        public open fun <get-request>(): org.w3c.fetch.Request
    public open val resultingClientId: kotlin.String
        public open fun <get-resultingClientId>(): kotlin.String
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
    public final fun respondWith(/*0*/ r: kotlin.js.Promise<org.w3c.fetch.Response>): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun stopImmediatePropagation(): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun stopPropagation(): kotlin.Unit
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
    public final override /*1*/ /*fake_override*/ fun waitUntil(/*0*/ f: kotlin.js.Promise<kotlin.Any?>): kotlin.Unit

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

public external interface FetchEventInit : org.w3c.workers.ExtendableEventInit {
    public open override /*1*/ /*fake_override*/ var bubbles: kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <get-bubbles>(): kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <set-bubbles>(/*0*/ value: kotlin.Boolean?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ var cancelable: kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <get-cancelable>(): kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <set-cancelable>(/*0*/ value: kotlin.Boolean?): kotlin.Unit
    public open var clientId: kotlin.String?
        public open fun <get-clientId>(): kotlin.String?
        public open fun <set-clientId>(/*0*/ value: kotlin.String?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ var composed: kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <get-composed>(): kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <set-composed>(/*0*/ value: kotlin.Boolean?): kotlin.Unit
    public open var preloadResponse: kotlin.js.Promise<kotlin.Any?>?
        public open fun <get-preloadResponse>(): kotlin.js.Promise<kotlin.Any?>?
        public open fun <set-preloadResponse>(/*0*/ value: kotlin.js.Promise<kotlin.Any?>?): kotlin.Unit
    public open var replacesClientId: kotlin.String?
        public open fun <get-replacesClientId>(): kotlin.String?
        public open fun <set-replacesClientId>(/*0*/ value: kotlin.String?): kotlin.Unit
    public open var request: org.w3c.fetch.Request?
        public open fun <get-request>(): org.w3c.fetch.Request?
        public open fun <set-request>(/*0*/ value: org.w3c.fetch.Request?): kotlin.Unit
    public open var resultingClientId: kotlin.String?
        public open fun <get-resultingClientId>(): kotlin.String?
        public open fun <set-resultingClientId>(/*0*/ value: kotlin.String?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

@kotlin.Suppress(names = {"NESTED_CLASS_IN_EXTERNAL_INTERFACE"}) public external interface FrameType {
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

public external interface MultiCacheQueryOptions : org.w3c.workers.CacheQueryOptions {
    public open var cacheName: kotlin.String?
        public open fun <get-cacheName>(): kotlin.String?
        public open fun <set-cacheName>(/*0*/ value: kotlin.String?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ var ignoreMethod: kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <get-ignoreMethod>(): kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <set-ignoreMethod>(/*0*/ value: kotlin.Boolean?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ var ignoreSearch: kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <get-ignoreSearch>(): kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <set-ignoreSearch>(/*0*/ value: kotlin.Boolean?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ var ignoreVary: kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <get-ignoreVary>(): kotlin.Boolean?
        public open override /*1*/ /*fake_override*/ fun <set-ignoreVary>(/*0*/ value: kotlin.Boolean?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

public abstract external class NavigationPreloadManager {
    /*primary*/ public constructor NavigationPreloadManager()
    public final fun disable(): kotlin.js.Promise<kotlin.Unit>
    public final fun enable(): kotlin.js.Promise<kotlin.Unit>
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public final fun getState(): kotlin.js.Promise<org.w3c.workers.NavigationPreloadState>
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public final fun setHeaderValue(/*0*/ value: kotlin.String): kotlin.js.Promise<kotlin.Unit>
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

public external interface NavigationPreloadState {
    public open var enabled: kotlin.Boolean?
        public open fun <get-enabled>(): kotlin.Boolean?
        public open fun <set-enabled>(/*0*/ value: kotlin.Boolean?): kotlin.Unit
    public open var headerValue: kotlin.String?
        public open fun <get-headerValue>(): kotlin.String?
        public open fun <set-headerValue>(/*0*/ value: kotlin.String?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

public external interface RegistrationOptions {
    public open var scope: kotlin.String?
        public open fun <get-scope>(): kotlin.String?
        public open fun <set-scope>(/*0*/ value: kotlin.String?): kotlin.Unit
    public open var type: org.w3c.dom.WorkerType?
        public open fun <get-type>(): org.w3c.dom.WorkerType?
        public open fun <set-type>(/*0*/ value: org.w3c.dom.WorkerType?): kotlin.Unit
    public open var updateViaCache: org.w3c.workers.ServiceWorkerUpdateViaCache?
        public open fun <get-updateViaCache>(): org.w3c.workers.ServiceWorkerUpdateViaCache?
        public open fun <set-updateViaCache>(/*0*/ value: org.w3c.workers.ServiceWorkerUpdateViaCache?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

public open external class ServiceWorker : org.w3c.dom.events.EventTarget, org.w3c.workers.UnionClientOrMessagePortOrServiceWorker {
    /*primary*/ public constructor ServiceWorker()
    public final var onerror: ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <get-onerror>(): ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <set-onerror>(/*0*/ <set-?>: ((org.w3c.dom.events.Event) -> dynamic)?): kotlin.Unit
    public final var onstatechange: ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <get-onstatechange>(): ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <set-onstatechange>(/*0*/ <set-?>: ((org.w3c.dom.events.Event) -> dynamic)?): kotlin.Unit
    public open val scriptURL: kotlin.String
        public open fun <get-scriptURL>(): kotlin.String
    public open val state: org.w3c.workers.ServiceWorkerState
        public open fun <get-state>(): org.w3c.workers.ServiceWorkerState
    public final override /*1*/ /*fake_override*/ fun addEventListener(/*0*/ type: kotlin.String, /*1*/ callback: ((org.w3c.dom.events.Event) -> kotlin.Unit)?, /*2*/ options: dynamic = ...): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun addEventListener(/*0*/ type: kotlin.String, /*1*/ callback: org.w3c.dom.events.EventListener?, /*2*/ options: dynamic = ...): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun dispatchEvent(/*0*/ event: org.w3c.dom.events.Event): kotlin.Boolean
    public open override /*2*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*2*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public final fun postMessage(/*0*/ message: kotlin.Any?, /*1*/ options: [ERROR : PostMessageOptions] = ...): kotlin.Unit
    public final fun postMessage(/*0*/ message: kotlin.Any?, /*1*/ transfer: kotlin.Array<dynamic>): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun removeEventListener(/*0*/ type: kotlin.String, /*1*/ callback: ((org.w3c.dom.events.Event) -> kotlin.Unit)?, /*2*/ options: dynamic = ...): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun removeEventListener(/*0*/ type: kotlin.String, /*1*/ callback: org.w3c.dom.events.EventListener?, /*2*/ options: dynamic = ...): kotlin.Unit
    public open override /*2*/ /*fake_override*/ fun toString(): kotlin.String
}

public open external class ServiceWorkerContainer : org.w3c.dom.events.EventTarget {
    /*primary*/ public constructor ServiceWorkerContainer()
    public open val controller: org.w3c.workers.ServiceWorker?
        public open fun <get-controller>(): org.w3c.workers.ServiceWorker?
    public final var oncontrollerchange: ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <get-oncontrollerchange>(): ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <set-oncontrollerchange>(/*0*/ <set-?>: ((org.w3c.dom.events.Event) -> dynamic)?): kotlin.Unit
    public final var onmessage: ((org.w3c.dom.MessageEvent) -> dynamic)?
        public final fun <get-onmessage>(): ((org.w3c.dom.MessageEvent) -> dynamic)?
        public final fun <set-onmessage>(/*0*/ <set-?>: ((org.w3c.dom.MessageEvent) -> dynamic)?): kotlin.Unit
    public final var onmessageerror: ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <get-onmessageerror>(): ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <set-onmessageerror>(/*0*/ <set-?>: ((org.w3c.dom.events.Event) -> dynamic)?): kotlin.Unit
    public open val ready: kotlin.js.Promise<org.w3c.workers.ServiceWorkerRegistration>
        public open fun <get-ready>(): kotlin.js.Promise<org.w3c.workers.ServiceWorkerRegistration>
    public final override /*1*/ /*fake_override*/ fun addEventListener(/*0*/ type: kotlin.String, /*1*/ callback: ((org.w3c.dom.events.Event) -> kotlin.Unit)?, /*2*/ options: dynamic = ...): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun addEventListener(/*0*/ type: kotlin.String, /*1*/ callback: org.w3c.dom.events.EventListener?, /*2*/ options: dynamic = ...): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun dispatchEvent(/*0*/ event: org.w3c.dom.events.Event): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public final fun getRegistration(/*0*/ clientURL: kotlin.String = ...): kotlin.js.Promise<kotlin.Any?>
    public final fun getRegistrations(): kotlin.js.Promise<kotlin.Array<out org.w3c.workers.ServiceWorkerRegistration>>
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public final fun register(/*0*/ scriptURL: kotlin.String, /*1*/ options: org.w3c.workers.RegistrationOptions = ...): kotlin.js.Promise<org.w3c.workers.ServiceWorkerRegistration>
    public final override /*1*/ /*fake_override*/ fun removeEventListener(/*0*/ type: kotlin.String, /*1*/ callback: ((org.w3c.dom.events.Event) -> kotlin.Unit)?, /*2*/ options: dynamic = ...): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun removeEventListener(/*0*/ type: kotlin.String, /*1*/ callback: org.w3c.dom.events.EventListener?, /*2*/ options: dynamic = ...): kotlin.Unit
    public final fun startMessages(): kotlin.Unit
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

public open external class ServiceWorkerGlobalScope : org.w3c.dom.WorkerGlobalScope {
    /*primary*/ public constructor ServiceWorkerGlobalScope()
    public abstract override /*1*/ /*fake_override*/ val caches: org.w3c.workers.CacheStorage
        public abstract override /*1*/ /*fake_override*/ fun <get-caches>(): org.w3c.workers.CacheStorage
    public open val clients: org.w3c.workers.Clients
        public open fun <get-clients>(): org.w3c.workers.Clients
    public open override /*1*/ /*fake_override*/ val location: org.w3c.dom.WorkerLocation
        public open override /*1*/ /*fake_override*/ fun <get-location>(): org.w3c.dom.WorkerLocation
    public open override /*1*/ /*fake_override*/ val navigator: org.w3c.dom.WorkerNavigator
        public open override /*1*/ /*fake_override*/ fun <get-navigator>(): org.w3c.dom.WorkerNavigator
    public final var onactivate: ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <get-onactivate>(): ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <set-onactivate>(/*0*/ <set-?>: ((org.w3c.dom.events.Event) -> dynamic)?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ var onerror: ((dynamic, kotlin.String, kotlin.Int, kotlin.Int, kotlin.Any?) -> dynamic)?
        public open override /*1*/ /*fake_override*/ fun <get-onerror>(): ((dynamic, kotlin.String, kotlin.Int, kotlin.Int, kotlin.Any?) -> dynamic)?
        public open override /*1*/ /*fake_override*/ fun <set-onerror>(/*0*/ <set-?>: ((dynamic, kotlin.String, kotlin.Int, kotlin.Int, kotlin.Any?) -> dynamic)?): kotlin.Unit
    public final var onfetch: ((org.w3c.workers.FetchEvent) -> dynamic)?
        public final fun <get-onfetch>(): ((org.w3c.workers.FetchEvent) -> dynamic)?
        public final fun <set-onfetch>(/*0*/ <set-?>: ((org.w3c.workers.FetchEvent) -> dynamic)?): kotlin.Unit
    public final var oninstall: ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <get-oninstall>(): ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <set-oninstall>(/*0*/ <set-?>: ((org.w3c.dom.events.Event) -> dynamic)?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ var onlanguagechange: ((org.w3c.dom.events.Event) -> dynamic)?
        public open override /*1*/ /*fake_override*/ fun <get-onlanguagechange>(): ((org.w3c.dom.events.Event) -> dynamic)?
        public open override /*1*/ /*fake_override*/ fun <set-onlanguagechange>(/*0*/ <set-?>: ((org.w3c.dom.events.Event) -> dynamic)?): kotlin.Unit
    public final var onmessage: ((org.w3c.dom.MessageEvent) -> dynamic)?
        public final fun <get-onmessage>(): ((org.w3c.dom.MessageEvent) -> dynamic)?
        public final fun <set-onmessage>(/*0*/ <set-?>: ((org.w3c.dom.MessageEvent) -> dynamic)?): kotlin.Unit
    public final var onmessageerror: ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <get-onmessageerror>(): ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <set-onmessageerror>(/*0*/ <set-?>: ((org.w3c.dom.events.Event) -> dynamic)?): kotlin.Unit
    public final var onnotificationclick: ((org.w3c.notifications.NotificationEvent) -> dynamic)?
        public final fun <get-onnotificationclick>(): ((org.w3c.notifications.NotificationEvent) -> dynamic)?
        public final fun <set-onnotificationclick>(/*0*/ <set-?>: ((org.w3c.notifications.NotificationEvent) -> dynamic)?): kotlin.Unit
    public final var onnotificationclose: ((org.w3c.notifications.NotificationEvent) -> dynamic)?
        public final fun <get-onnotificationclose>(): ((org.w3c.notifications.NotificationEvent) -> dynamic)?
        public final fun <set-onnotificationclose>(/*0*/ <set-?>: ((org.w3c.notifications.NotificationEvent) -> dynamic)?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ var onoffline: ((org.w3c.dom.events.Event) -> dynamic)?
        public open override /*1*/ /*fake_override*/ fun <get-onoffline>(): ((org.w3c.dom.events.Event) -> dynamic)?
        public open override /*1*/ /*fake_override*/ fun <set-onoffline>(/*0*/ <set-?>: ((org.w3c.dom.events.Event) -> dynamic)?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ var ononline: ((org.w3c.dom.events.Event) -> dynamic)?
        public open override /*1*/ /*fake_override*/ fun <get-ononline>(): ((org.w3c.dom.events.Event) -> dynamic)?
        public open override /*1*/ /*fake_override*/ fun <set-ononline>(/*0*/ <set-?>: ((org.w3c.dom.events.Event) -> dynamic)?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ var onrejectionhandled: ((org.w3c.dom.events.Event) -> dynamic)?
        public open override /*1*/ /*fake_override*/ fun <get-onrejectionhandled>(): ((org.w3c.dom.events.Event) -> dynamic)?
        public open override /*1*/ /*fake_override*/ fun <set-onrejectionhandled>(/*0*/ <set-?>: ((org.w3c.dom.events.Event) -> dynamic)?): kotlin.Unit
    public open override /*1*/ /*fake_override*/ var onunhandledrejection: ((org.w3c.dom.PromiseRejectionEvent) -> dynamic)?
        public open override /*1*/ /*fake_override*/ fun <get-onunhandledrejection>(): ((org.w3c.dom.PromiseRejectionEvent) -> dynamic)?
        public open override /*1*/ /*fake_override*/ fun <set-onunhandledrejection>(/*0*/ <set-?>: ((org.w3c.dom.PromiseRejectionEvent) -> dynamic)?): kotlin.Unit
    public abstract override /*1*/ /*fake_override*/ val origin: kotlin.String
        public abstract override /*1*/ /*fake_override*/ fun <get-origin>(): kotlin.String
    public abstract override /*1*/ /*fake_override*/ val performance: org.w3c.performance.Performance
        public abstract override /*1*/ /*fake_override*/ fun <get-performance>(): org.w3c.performance.Performance
    public open val registration: org.w3c.workers.ServiceWorkerRegistration
        public open fun <get-registration>(): org.w3c.workers.ServiceWorkerRegistration
    public open override /*1*/ /*fake_override*/ val self: org.w3c.dom.WorkerGlobalScope
        public open override /*1*/ /*fake_override*/ fun <get-self>(): org.w3c.dom.WorkerGlobalScope
    public open val serviceWorker: org.w3c.workers.ServiceWorker
        public open fun <get-serviceWorker>(): org.w3c.workers.ServiceWorker
    public final override /*1*/ /*fake_override*/ fun addEventListener(/*0*/ type: kotlin.String, /*1*/ callback: ((org.w3c.dom.events.Event) -> kotlin.Unit)?, /*2*/ options: dynamic = ...): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun addEventListener(/*0*/ type: kotlin.String, /*1*/ callback: org.w3c.dom.events.EventListener?, /*2*/ options: dynamic = ...): kotlin.Unit
    public abstract override /*1*/ /*fake_override*/ fun atob(/*0*/ data: kotlin.String): kotlin.String
    public abstract override /*1*/ /*fake_override*/ fun btoa(/*0*/ data: kotlin.String): kotlin.String
    public abstract override /*1*/ /*fake_override*/ fun clearInterval(/*0*/ handle: kotlin.Int = ...): kotlin.Unit
    public abstract override /*1*/ /*fake_override*/ fun clearTimeout(/*0*/ handle: kotlin.Int = ...): kotlin.Unit
    public abstract override /*1*/ /*fake_override*/ fun createImageBitmap(/*0*/ image: org.w3c.dom.ImageBitmapSource, /*1*/ sx: kotlin.Int, /*2*/ sy: kotlin.Int, /*3*/ sw: kotlin.Int, /*4*/ sh: kotlin.Int, /*5*/ options: org.w3c.dom.ImageBitmapOptions = ...): kotlin.js.Promise<org.w3c.dom.ImageBitmap>
    public abstract override /*1*/ /*fake_override*/ fun createImageBitmap(/*0*/ image: org.w3c.dom.ImageBitmapSource, /*1*/ options: org.w3c.dom.ImageBitmapOptions = ...): kotlin.js.Promise<org.w3c.dom.ImageBitmap>
    public final override /*1*/ /*fake_override*/ fun dispatchEvent(/*0*/ event: org.w3c.dom.events.Event): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public abstract override /*1*/ /*fake_override*/ fun fetch(/*0*/ input: dynamic, /*1*/ init: org.w3c.fetch.RequestInit = ...): kotlin.js.Promise<org.w3c.fetch.Response>
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public final override /*1*/ /*fake_override*/ fun importScripts(/*0*/ vararg urls: kotlin.String /*kotlin.Array<out kotlin.String>*/): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun removeEventListener(/*0*/ type: kotlin.String, /*1*/ callback: ((org.w3c.dom.events.Event) -> kotlin.Unit)?, /*2*/ options: dynamic = ...): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun removeEventListener(/*0*/ type: kotlin.String, /*1*/ callback: org.w3c.dom.events.EventListener?, /*2*/ options: dynamic = ...): kotlin.Unit
    public abstract override /*1*/ /*fake_override*/ fun setInterval(/*0*/ handler: dynamic, /*1*/ timeout: kotlin.Int = ..., /*2*/ vararg arguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): kotlin.Int
    public abstract override /*1*/ /*fake_override*/ fun setTimeout(/*0*/ handler: dynamic, /*1*/ timeout: kotlin.Int = ..., /*2*/ vararg arguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): kotlin.Int
    public final fun skipWaiting(): kotlin.js.Promise<kotlin.Unit>
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

public open external class ServiceWorkerRegistration : org.w3c.dom.events.EventTarget {
    /*primary*/ public constructor ServiceWorkerRegistration()
    public open val active: org.w3c.workers.ServiceWorker?
        public open fun <get-active>(): org.w3c.workers.ServiceWorker?
    public open val installing: org.w3c.workers.ServiceWorker?
        public open fun <get-installing>(): org.w3c.workers.ServiceWorker?
    public open val navigationPreload: org.w3c.workers.NavigationPreloadManager
        public open fun <get-navigationPreload>(): org.w3c.workers.NavigationPreloadManager
    public final var onupdatefound: ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <get-onupdatefound>(): ((org.w3c.dom.events.Event) -> dynamic)?
        public final fun <set-onupdatefound>(/*0*/ <set-?>: ((org.w3c.dom.events.Event) -> dynamic)?): kotlin.Unit
    public open val scope: kotlin.String
        public open fun <get-scope>(): kotlin.String
    public open val updateViaCache: org.w3c.workers.ServiceWorkerUpdateViaCache
        public open fun <get-updateViaCache>(): org.w3c.workers.ServiceWorkerUpdateViaCache
    public open val waiting: org.w3c.workers.ServiceWorker?
        public open fun <get-waiting>(): org.w3c.workers.ServiceWorker?
    public final override /*1*/ /*fake_override*/ fun addEventListener(/*0*/ type: kotlin.String, /*1*/ callback: ((org.w3c.dom.events.Event) -> kotlin.Unit)?, /*2*/ options: dynamic = ...): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun addEventListener(/*0*/ type: kotlin.String, /*1*/ callback: org.w3c.dom.events.EventListener?, /*2*/ options: dynamic = ...): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun dispatchEvent(/*0*/ event: org.w3c.dom.events.Event): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public final fun getNotifications(/*0*/ filter: org.w3c.notifications.GetNotificationOptions = ...): kotlin.js.Promise<kotlin.Array<org.w3c.notifications.Notification>>
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public final override /*1*/ /*fake_override*/ fun removeEventListener(/*0*/ type: kotlin.String, /*1*/ callback: ((org.w3c.dom.events.Event) -> kotlin.Unit)?, /*2*/ options: dynamic = ...): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun removeEventListener(/*0*/ type: kotlin.String, /*1*/ callback: org.w3c.dom.events.EventListener?, /*2*/ options: dynamic = ...): kotlin.Unit
    public final fun showNotification(/*0*/ title: kotlin.String, /*1*/ options: org.w3c.notifications.NotificationOptions = ...): kotlin.js.Promise<kotlin.Unit>
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
    public final fun unregister(): kotlin.js.Promise<kotlin.Boolean>
    public final fun update(): kotlin.js.Promise<kotlin.Unit>
}

@kotlin.Suppress(names = {"NESTED_CLASS_IN_EXTERNAL_INTERFACE"}) public external interface ServiceWorkerState {
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

@kotlin.Suppress(names = {"NESTED_CLASS_IN_EXTERNAL_INTERFACE"}) public external interface ServiceWorkerUpdateViaCache {
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

public external interface UnionClientOrMessagePortOrServiceWorker {
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

public abstract external class WindowClient : org.w3c.workers.Client {
    /*primary*/ public constructor WindowClient()
    public open val ancestorOrigins: kotlin.Array<out kotlin.String>
        public open fun <get-ancestorOrigins>(): kotlin.Array<out kotlin.String>
    public open val focused: kotlin.Boolean
        public open fun <get-focused>(): kotlin.Boolean
    public open override /*1*/ /*fake_override*/ val frameType: org.w3c.workers.FrameType
        public open override /*1*/ /*fake_override*/ fun <get-frameType>(): org.w3c.workers.FrameType
    public open override /*1*/ /*fake_override*/ val id: kotlin.String
        public open override /*1*/ /*fake_override*/ fun <get-id>(): kotlin.String
    public open override /*1*/ /*fake_override*/ val type: org.w3c.workers.ClientType
        public open override /*1*/ /*fake_override*/ fun <get-type>(): org.w3c.workers.ClientType
    public open override /*1*/ /*fake_override*/ val url: kotlin.String
        public open override /*1*/ /*fake_override*/ fun <get-url>(): kotlin.String
    public open val visibilityState: dynamic
        public open fun <get-visibilityState>(): dynamic
    public open override /*1*/ /*fake_override*/ fun equals(/*0*/ other: kotlin.Any?): kotlin.Boolean
    public final fun focus(): kotlin.js.Promise<org.w3c.workers.WindowClient>
    public open override /*1*/ /*fake_override*/ fun hashCode(): kotlin.Int
    public final fun navigate(/*0*/ url: kotlin.String): kotlin.js.Promise<org.w3c.workers.WindowClient?>
    public final override /*1*/ /*fake_override*/ fun postMessage(/*0*/ message: kotlin.Any?, /*1*/ options: [ERROR : PostMessageOptions] = ...): kotlin.Unit
    public final override /*1*/ /*fake_override*/ fun postMessage(/*0*/ message: kotlin.Any?, /*1*/ transfer: kotlin.Array<dynamic>): kotlin.Unit
    public open override /*1*/ /*fake_override*/ fun toString(): kotlin.String
}

