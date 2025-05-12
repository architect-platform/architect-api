package io.github.architectplatform.api.phases

import io.github.architectplatform.api.command.CommandResult

open class PhaseResult(success: Boolean, output: String) : CommandResult(success, output) {
	companion object {
		fun success(output: String): PhaseResult {
			return PhaseResult(true, output)
		}

		fun failure(output: String): PhaseResult {
			return PhaseResult(false, output)
		}
	}
}