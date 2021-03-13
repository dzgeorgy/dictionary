package ru.dzgeorgy.domain.utils

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

sealed class Result<T> {

    data class Success<T>(val data: T) : Result<T>()
    data class Failure(val exception: Exception) : Result<Nothing>()

}

suspend inline fun <T> safeApiCall(
    dispatcher: CoroutineDispatcher = Dispatchers.IO,
    crossinline call: suspend () -> T,
) = withContext(dispatcher) {
    try {
        Result.Success(call.invoke())
    } catch (e: Exception) {
        Result.Failure(e)
    }
}
