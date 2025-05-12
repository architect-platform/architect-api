package io.github.architectplatform.api.tasks.init

import io.github.architectplatform.api.tasks.TaskResult

class InitTaskResult(success: Boolean, output: String) : TaskResult(success, output) {
	companion object {
		fun success(output: String): InitTaskResult {
			return InitTaskResult(true, output)
		}

		fun failure(output: String): InitTaskResult {
			return InitTaskResult(false, output)
		}
	}
}