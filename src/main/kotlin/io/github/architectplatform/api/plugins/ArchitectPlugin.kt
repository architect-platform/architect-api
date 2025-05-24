package io.github.architectplatform.api.plugins

import io.github.architectplatform.api.tasks.TaskRegistry

/**
 * Plugin interface for registering Activities.
 */
interface ArchitectPlugin<C> {
	val id: String
	val contextKey: String
	val contextClass: Class<C>
	var context: C?
		get() = null
		set(value) {}

	fun init(context: Any?) {
		@Suppress("UNCHECKED_CAST")
		this.context = context as? C
	}

	fun register(registry: TaskRegistry)
}

