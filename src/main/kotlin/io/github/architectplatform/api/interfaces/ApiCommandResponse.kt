package io.github.architectplatform.api.interfaces

import io.github.architectplatform.api.command.CommandResult

interface ApiCommandResponse {
	val success: Boolean
	val output: String

	companion object {
		fun apply(result: CommandResult): ApiCommandResponse {
			return if (result.success) {
				Success(result.output)
			} else {
				Failure(result.output)
			}
		}
	}

	data class Success(override val output: String) : ApiCommandResponse {
		override val success: Boolean = true
	}

	data class Failure(override val output: String) : ApiCommandResponse {
		override val success: Boolean = false
	}
}
