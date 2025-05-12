package io.github.architectplatform.api.tasks.run

import io.github.architectplatform.api.tasks.TaskResult

class RunTaskResult(success: Boolean, output: String) : TaskResult(success, output) {
	companion object {
		fun success(output: String): RunTaskResult {
			return RunTaskResult(true, output)
		}

		fun failure(output: String): RunTaskResult {
			return RunTaskResult(false, output)
		}
	}
}