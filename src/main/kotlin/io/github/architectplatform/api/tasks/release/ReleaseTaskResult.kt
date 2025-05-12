package io.github.architectplatform.api.tasks.release

import io.github.architectplatform.api.tasks.TaskResult

class ReleaseTaskResult(success: Boolean, output: String) : TaskResult(success, output) {
	companion object {
		fun success(output: String): ReleaseTaskResult {
			return ReleaseTaskResult(true, output)
		}

		fun failure(output: String): ReleaseTaskResult {
			return ReleaseTaskResult(false, output)
		}
	}
}