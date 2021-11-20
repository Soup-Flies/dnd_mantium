package mantium.auth

import mantium.structure.IResponseBody
import mantium.structure.IResponseData
import kotlin.js.Json

external interface IAuthLogin {
    val username: String
    val password: String
}

external interface IAuthResponse : IResponseData<IAuthResponseBody>
external interface IAuthResponseBody : IResponseBody<IAuthResponseAttributes>

external interface IAuthResponseAttributes : Json {
    @JsName("bearer_id") val bearerId: String

    @JsName("expires_on") val expiresOn: String
    @JsName("token_type") val tokenType: String
}