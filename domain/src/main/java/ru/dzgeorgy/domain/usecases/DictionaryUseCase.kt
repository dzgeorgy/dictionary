package ru.dzgeorgy.domain.usecases

import ru.dzgeorgy.domain.entities.Word
import ru.dzgeorgy.domain.repositories.WordsRepository
import ru.dzgeorgy.domain.usecases.DictionaryUseCase.SORT.*

class DictionaryUseCase(private val wordsRepository: WordsRepository) {

    suspend fun getWords(sort: SORT) = with(wordsRepository) {
        when (sort) {
            ALPHABETICALLY -> getWordsAlphabetically()
            RATING_ASC -> getWordsByRatingAscending()
            RATING_DESC -> getWordsByRatingDescending()
            NOUNS -> getNouns()
            ADJECTIVES -> getAdjectives()
            VERBS -> getVerbs()
            ADVERBS -> getAdverbs()
        }
    }

    suspend fun getWord(word: String) = wordsRepository.getWord(word)

    suspend fun save(word: Word) = wordsRepository.save(word)

    enum class SORT {
        ALPHABETICALLY,
        RATING_ASC,
        RATING_DESC,
        NOUNS,
        ADJECTIVES,
        VERBS,
        ADVERBS
    }

}