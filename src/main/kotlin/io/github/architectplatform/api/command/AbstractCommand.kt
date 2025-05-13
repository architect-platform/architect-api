package io.github.architectplatform.api.command

import io.github.architectplatform.api.context.Context

abstract class AbstractCommand<Res : CommandResult> : Command<Res> {

	var context: Context = emptyMap()

	/**
	 * Get the following context object by key.
	 * The key can also use . to access nested objects.
	 * This function implements a simple dot notation for accessing nested objects.
	 */
	@Suppress("UNCHECKED_CAST")
	fun <T> getContextObject(key: String): T? {
		val keys = key.split(".")
		var current: Any? = context
		for (k in keys) {
			if (current is Map<*, *>) {
				current = current[k] as Context?
			} else if (current is List<*>) {
				val index = k.toIntOrNull()
				if (index != null && index < current.size) {
					current = current[index] as Context?
				} else {
					return null
				}
			} else {
				return null
			}
		}
		return current as? T
	}

	override fun initialize(context: Context) {
		this.context = context
	}

}

