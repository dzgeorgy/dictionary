package ru.dzgeorgy.domain.repositories

import androidx.paging.PagingData
import ru.dzgeorgy.domain.entities.Word
import ru.dzgeorgy.domain.utils.Result

interface WordsRepository {

    suspend fun save(word: Word): Long

    suspend fun getWord(word: String): Result<Word>

    suspend fun getWordsAlphabetically(): PagingData<Word>

    suspend fun getWordsByRatingAscending(): PagingData<Word>

    suspend fun getWordsByRatingDescending(): PagingData<Word>

    suspend fun getNouns(): PagingData<Word>

    suspend fun getAdjectives(): PagingData<Word>

    suspend fun getVerbs(): PagingData<Word>

    suspend fun getAdverbs(): PagingData<Word>

}