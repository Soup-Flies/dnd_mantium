package mantium.ai

enum class AiProvider : IAiProvider {
    OPEN_AI {
        override val apiName: String = "openai"
    },
    COHERE {
        override val apiName: String = "cohere"
    },
    MANTIUM {
        override val apiName: String = "mantium"
    };

    override val description: String = ""
}

interface IAiProvider {
    val apiName: String
    val description: String
}