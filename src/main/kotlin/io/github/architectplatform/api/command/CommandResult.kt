package io.github.architectplatform.api.command

open class CommandResult(val success: Boolean, val output: String) {
	companion object {
		fun success(output: String): CommandResult {
			return CommandResult(true, output)
		}

		fun failure(output: String): CommandResult {
			return CommandResult(false, output)
		}
	}
}
