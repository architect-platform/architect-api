package io.github.architectplatform.api.command

interface CommandResult {
	/**
	 * Indicates whether the command was successful.
	 */
	val success: Boolean
}

object EmptyCommandResult : CommandResult {
	override val success: Boolean
		get() = true
}