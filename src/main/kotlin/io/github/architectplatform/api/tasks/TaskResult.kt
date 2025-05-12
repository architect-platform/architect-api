package io.github.architectplatform.api.tasks

import io.github.architectplatform.api.command.CommandResult

open class TaskResult(success: Boolean, output: String) : CommandResult(success, output) {
	companion object {
		fun success(output: String): TaskResult {
			return TaskResult(true, output)
		}

		fun failure(output: String): TaskResult {
			return TaskResult(false, output)
		}
	}
}