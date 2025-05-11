package io.github.architectplatform.api.command

interface CommandResult {
	val success: Boolean
		get() = false
	val output: String
		get() = ""

	data class Success(override val output: String) : CommandResult {
		override val success: Boolean = true
	}

	data class Failure(override val output: String) : CommandResult {
		override val success: Boolean = false
	}
}
