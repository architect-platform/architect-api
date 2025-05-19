package io.github.architectplatform.api.project

import io.github.architectplatform.api.context.Config
import java.nio.file.Path


/**
 * Provides contextual services and config for Activities.
 */
interface ProjectContext {
	val dir: Path
	val config: Config
	fun <T : Any> service(type: Class<T>): T
}