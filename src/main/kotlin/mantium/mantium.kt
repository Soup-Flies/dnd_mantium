import mantium.ai.AiProvider
import mantium.ai.IAiMethods
import mantium.auth.IAuthLogin
import mantium.auth.IAuthResponse
import mantium.auth.IAuthRevoke
import kotlin.js.Promise

@JsModule("@mantium/mantiumapi")
@JsNonModule
external object mantiumAi {
    @JsName("ORIGIN") var origin: String
    @JsName("API_VERSION") var apiVersion: String
    @JsName("RESULT_STATUS_INTERVAL") var resultStatusInterval: Int

    @JsName("api_key") var apiKey: String?
    @JsName("ai_provider") var aiProvider: String

    var organization: String?

    @JsName("Auth") fun auth(): IAuth

    @JsName("AiMethods") fun aiMethods(provider: AiProvider): IAiMethods
}

external interface IAuth {
    fun accessTokenLogin(data: IAuthLogin): Promise<IAuthResponse>

    fun revokeToken(): Promise<IAuthRevoke>
}

// How to ref these values
//external val getOrigin: String
//external val getApiVersion: String
//external val getResultStatusInterval: Int