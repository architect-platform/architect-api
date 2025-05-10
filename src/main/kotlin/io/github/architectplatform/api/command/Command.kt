package io.github.architectplatform.api.command

/**
 * Represents a command that can be executed with a specific request to produce a result.
 *
 * @param Req The type of the request that the command accepts.
 * @param Res The type of the result that the command produces.
 *
 * @property name The name of the command.
 * @property description A brief description of the command.
 * @property usage A string that describes how to use the command.
 */
interface Command<Res: CommandResult> {

	/**
	 * The name of the command.
	 */
	val name: String

	/**
	 * A brief description of the command.
	 */
	val description: String
		get() = "No description provided"

	/**
	 * A string that describes how to use the command.
	 */
	val usage: String
		get() = "No usage provided"

	/**
	 * Executes the command with the given request and returns the result.
	 */
	fun execute(request: CommandRequest): Res
}

