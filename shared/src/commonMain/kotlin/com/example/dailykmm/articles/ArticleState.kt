package com.example.dailykmm.articles

data class ArticleState( //We have to use this way can't use sealed classes
    val articles: List<ArticlesModel> = listOf(),
    val loading: Boolean = false,
    val error: String? = null
)