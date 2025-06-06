package io.github.architectplatform.api.components.execution

import java.nio.file.Path

interface ResourceExtractor {
  fun copyFileFromResources(
      classLoader: ClassLoader,
      resourcePath: String,
      targetDir: Path,
      targetFileName: String? = null,
  )

  fun copyDirectoryFromResources(
      classLoader: ClassLoader,
      resourceRoot: String,
      targetDirectory: Path
  )

  fun getResourceFileContent(classLoader: ClassLoader, resourcePath: String): String

  fun listResourceFiles(classLoader: ClassLoader, resourceRoot: String): List<String>
}
