package io.github.architectplatform.api.core.tasks

interface Environment {
  fun <T> service(type: Class<T>): T

  fun publish(event: Any)
}
