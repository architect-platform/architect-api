package io.github.architectplatform.api.context

/**
 * A context is a set of information that is passed to a task.
 */
typealias Config = Map<String, Any>

fun <T> Config.getKey(key: String): T? {
	val keys = key.split('.')
	var current: Any? = this
	for (k in keys) {
		if (current is Map<*, *>) {
			current = current[k]
		} else if (current is List<*>) {
			current = current[k.toIntOrNull() ?: throw IllegalArgumentException("Invalid index: $k")]
		} else {
			throw IllegalStateException("Invalid context type: ${current?.javaClass}")
		}
	}
	return current as? T
}