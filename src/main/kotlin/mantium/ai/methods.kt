package mantium.ai

import mantium.structure.IResponseBody
import mantium.structure.IResponseData
import kotlin.js.Json

external interface IAiMethods {
    fun list(list: IListSize)
}

external interface IAiMethodsResponse : IResponseData<IAiMethodsBody> {
    override val links: IAiMethodsLinks
}

external interface IAiMethodsLinks : Json {
    @JsName("total_items") val totalItems: Int
    @JsName("current_page") val currentPage: Int
}

external interface IAiMethodsBody : IResponseBody<IAiMethodsAttributes>

external interface IAiMethodsAttributes {
    val name: String

    @JsName("api_name") val apiName: String
    val description: String
    val shareable: Boolean

    @JsName("ai_provider") val aiProvider: IAiProvider
    @JsName("ai_engines") val aiEngines: List<IAiEngines>

}

interface IListSize {
    val page: Int
    val size: Int
}
