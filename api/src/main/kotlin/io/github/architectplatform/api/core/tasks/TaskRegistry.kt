package io.github.architectplatform.api.core.tasks

/** Registry to collect Activities from plugins. */
interface TaskRegistry {
  fun add(task: Task)

  fun get(id: String): Task?

  fun all(): List<Task>
}
