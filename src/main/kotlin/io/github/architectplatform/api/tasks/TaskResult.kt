package io.github.architectplatform.api.tasks

interface TaskResult {
	val success: Boolean
	val message: String?

	companion object {
		data class TaskResultImpl(
			override val success: Boolean,
			override val message: String? = null,
		) : TaskResult

		fun success(message: String? = null): TaskResult = TaskResultImpl(
			success = true,
			message = message
		)

		fun failure(message: String? = null): TaskResult = TaskResultImpl(
			success = false,
			message = message
		)
	}
}