package io.github.architectplatform.api.tasks.publish

import io.github.architectplatform.api.tasks.TaskResult

class PublishTaskResult(success: Boolean, output: String) : TaskResult(success, output) {
	companion object {
		fun success(output: String): PublishTaskResult {
			return PublishTaskResult(true, output)
		}

		fun failure(output: String): PublishTaskResult {
			return PublishTaskResult(false, output)
		}
	}
}