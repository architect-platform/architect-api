package io.github.architectplatform.api.plugins

import io.github.architectplatform.api.tasks.TaskRegistry

/**
 * Plugin interface for registering Activities.
 */
interface ArchitectPlugin {
	val id: String
	fun register(registry: TaskRegistry)
}