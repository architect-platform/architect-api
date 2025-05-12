package io.github.architectplatform.api.tasks.verify

import io.github.architectplatform.api.tasks.TaskResult

class VerifyTaskResult(success: Boolean, output: String) : TaskResult(success, output) {
	companion object {
		fun success(output: String): VerifyTaskResult {
			return VerifyTaskResult(true, output)
		}

		fun failure(output: String): VerifyTaskResult {
			return VerifyTaskResult(false, output)
		}
	}
}