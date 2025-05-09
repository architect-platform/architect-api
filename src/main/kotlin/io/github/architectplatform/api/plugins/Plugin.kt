package io.github.architectplatform.api.plugins

import io.github.architectplatform.api.command.Command
import io.github.architectplatform.api.context.Context

/**
 * A plugin is a set of commands that can be executed.
 *
 * @param C the type of context that the plugin uses.
 */
interface Plugin<C: Context> {

	/**
	 * The context that the plugin uses.
	 */
	val name: String

	/**
	 * The name of the plugin.
	 */
	val description: String
		get() = "No description provided"

	/**
	 * A string that describes how to use the plugin.
	 */
	val usage: String
		get() = "No usage provided"

	/**
	 * The commands that the plugin provides.
	 */
	val commands: List<Command<*,*>>
}