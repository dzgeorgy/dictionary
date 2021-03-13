package ru.dzgeorgy.domain.entities

data class Definition(
    private val noun: List<String> = emptyList(),
    private val adjective: List<String> = emptyList(),
    private val verb: List<String> = emptyList(),
    private val adverb: List<String> = emptyList(),
)
