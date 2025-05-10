package io.github.architectplatform.api.command

interface CommandResult {
	val success: Boolean
	val output: String

	data class Success(override val output: String) : CommandResult {
		override val success: Boolean = true
	}

	data class Failure(override val output: String) : CommandResult {
		override val success: Boolean = false
	}
}
