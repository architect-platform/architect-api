package io.github.architectplatform.api.core.tasks

interface TaskResult {
  val success: Boolean
  val message: String?
  val results: List<TaskResult>

  companion object {
    data class TaskResultImpl(
        override val success: Boolean,
        override val message: String? = null,
        override val results: List<TaskResult> = emptyList(),
    ) : TaskResult

    fun success(message: String? = null, results: List<TaskResult> = emptyList()): TaskResult =
        TaskResultImpl(success = true, message = message, results = results)

    fun failure(message: String? = null, results: List<TaskResult> = emptyList()): TaskResult =
        TaskResultImpl(success = false, message = message, results = results)
  }
}
