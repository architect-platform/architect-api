package io.github.architectplatform.api.execution

import java.nio.file.Path

interface ResourceExtractor {
	fun copyFileFromResources(resourcePath: String, targetDir: Path, targetFileName: String? = null)
	fun copyDirectoryFromResources(resourceRoot: String, targetDirectory: Path)
	fun getResourceFileContent(resourcePath: String): String
	fun listResourceFiles(resourceRoot: String): List<String>
}