package io.github.architectplatform.api.tasks.test

import io.github.architectplatform.api.tasks.TaskResult

class TestTaskResult(success: Boolean, output: String) : TaskResult(success, output) {
	companion object {
		fun success(output: String): TestTaskResult {
			return TestTaskResult(true, output)
		}

		fun failure(output: String): TestTaskResult {
			return TestTaskResult(false, output)
		}
	}
}