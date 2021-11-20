package mantium.structure

import kotlin.js.Json

external interface IResponseData<T> : Json {
    val detail: dynamic

    val data: T

    val included: List<Any>
    val meta: Json
    val links: Json
}

external interface IResponseBody<T> : Json {
    val attributes: T

    val id: String
    val type: String
    val relationships: Json
}