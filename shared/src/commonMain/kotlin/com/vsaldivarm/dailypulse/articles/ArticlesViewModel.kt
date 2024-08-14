package com.vsaldivarm.dailypulse.articles

import com.vsaldivarm.dailypulse.BaseViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ArticlesViewModel : BaseViewModel() {
    // privado es mutable
    private val _articlesState: MutableStateFlow<ArticlesState> = MutableStateFlow(ArticlesState())

    // publico inmutable
    val articlesState: StateFlow<ArticlesState> get() = _articlesState

    init {
        getArticles()
    }

    private fun getArticles() {
        scope.launch {
            delay(timeMillis = 500)
            _articlesState.emit(ArticlesState())
        }
    }
}