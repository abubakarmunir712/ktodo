package com.ktodo
import kotlinx.serialization.Serializable

@Serializable
data class TodoModel(
    var id: Int,
    var title: String = "Untitled",
    var description: String,
    var isDone: Boolean,
) {
    fun toggleDone() {
        isDone = !isDone
    }
}