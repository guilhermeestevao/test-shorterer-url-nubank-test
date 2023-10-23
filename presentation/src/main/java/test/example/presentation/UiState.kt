package test.example.presentation

sealed class UiState<out T : Any> {

    object Idle : UiState<Nothing>()
    object Loading : UiState<Nothing>()
    data class Success<T : Any>(val data: T) : UiState<T>()
    data class Error(val message: String) : UiState<Nothing>()

}