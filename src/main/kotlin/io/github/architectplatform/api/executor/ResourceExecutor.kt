package io.github.architectplatform.api.executor

import java.io.InputStream
import java.nio.file.Path

interface ResourceExecutor {
    fun copyFileFromResources(resourcePath: String, targetDir: Path, targetFileName: String? = null)
    fun copyDirectoryFromResources(resourceRoot: String, targetDirectory: Path)
    fun getResourceFileContent(resourcePath: String): String
    fun listResourceFiles(resourceRoot: String): List<String>
    fun copyExecutable(input: InputStream, target: Path)
}