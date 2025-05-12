package io.github.architectplatform.api.tasks.build

import io.github.architectplatform.api.tasks.TaskResult

class BuildTaskResult(success: Boolean, output: String) : TaskResult(success, output) {
	companion object {
		fun success(output: String): BuildTaskResult {
			return BuildTaskResult(true, output)
		}

		fun failure(output: String): BuildTaskResult {
			return BuildTaskResult(false, output)
		}
	}
}