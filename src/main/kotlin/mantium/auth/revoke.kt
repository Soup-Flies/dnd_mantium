package mantium.auth

import mantium.structure.IResponseBody
import mantium.structure.IResponseData
import kotlin.js.Json

external interface IAuthRevoke : IResponseData<IAuthRevokeBody>
external interface IAuthRevokeBody : IResponseBody<IAuthRevokeAttributes>

external interface IAuthRevokeAttributes : Json {
    val error: String?
    val message: String
}