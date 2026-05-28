package com.ktodo

import java.io.File

data class Config(
    val filePath: String = "data/todos.json"
) {
    fun initialize() {
        val file = File(filePath)

        // Create "data" dir if it does not exist
        file.parentFile?.mkdirs()

        if (!file.exists()) {
            file.createNewFile()
        }
    }
}