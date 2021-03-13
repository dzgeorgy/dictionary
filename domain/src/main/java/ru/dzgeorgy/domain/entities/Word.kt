package ru.dzgeorgy.domain.entities

data class Word(
    val word: String,
    val definition: Definition,
    val example: List<String>,
    val terms: List<String>,
    val tests: Int = 0,
    val correct: Int = 0,
    val rating: Float = 0f,
)
