package io.github.architectplatform.api.core.project

import java.nio.file.Path


/**
 * Provides contextual services and config for Activities.
 */
interface ProjectContext {
	val dir: Path
	val config: Config
	fun <T> service(type: Class<T>): T
}