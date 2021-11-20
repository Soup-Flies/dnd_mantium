import mantium.auth.IAuthLogin

const val mPassword = "mantiumPassword02@"
const val mUsername = "benjcharais+mantium@gmail.com"

fun main() {
    println("Kotlin for JS yo")

    val origin = mantiumAi.origin
    val apiVersion = mantiumAi.apiVersion

    println("Our API Origin: $origin and API Version: $apiVersion")

    val auth = mantiumAi.auth()

    val login = auth.accessTokenLogin(object : IAuthLogin {
        override val username: String = mUsername
        override val password: String = mPassword
    })

    login.then { response ->
        if (response.detail != null) {

            println("Auth Error detail: ${response.detail}")
            return@then
        }

        val bearerData = response.data.attributes.bearerId

        println("Our bearer first 4: ${bearerData.take(4)}")

        mantiumAi.apiKey = bearerData
    }
}

