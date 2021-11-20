package mantium.ai

external interface IAiEngines {
    val name: String
    @JsName("use_cases") val useCases: String
    val description: String
    @JsName("cost_ranking") val costRanking: Int
}