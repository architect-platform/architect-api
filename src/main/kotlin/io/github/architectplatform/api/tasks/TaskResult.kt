package io.github.architectplatform.api.tasks

interface TaskResult {
	val success: Boolean
	val message: String?

	companion object {
		fun Success(message: String? = null): TaskResult = object : TaskResult {
			override val success: Boolean = true
			override val message: String? = message
		}

		fun Failure(message: String? = null): TaskResult = object : TaskResult {
			override val success: Boolean = false
			override val message: String? = message
		}
	}
}