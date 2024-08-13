package com.vsaldivarm.dailypulse.articles

import com.vsaldivarm.dailypulse.BaseViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ArticlesViewModel: BaseViewModel() {
    // privado es mutable
    private val _articelsState: MutableStateFlow<ArticlesState> = MutableStateFlow(ArticlesState())
    // publico inmutable
    val articelsState: StateFlow<ArticlesState> get() = _articelsState
}