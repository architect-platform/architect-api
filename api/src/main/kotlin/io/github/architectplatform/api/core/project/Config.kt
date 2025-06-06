package io.github.architectplatform.api.core.project

/** A config is a set of information that is passed to a task. */
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
      throw IllegalStateException("Invalid config type: ${current?.javaClass}")
    }
  }
  @Suppress("UNCHECKED_CAST")
  return current as? T
}
