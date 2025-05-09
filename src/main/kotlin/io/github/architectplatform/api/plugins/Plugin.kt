package io.github.architectplatform.api.plugins

import io.github.architectplatform.api.command.Command
import io.github.architectplatform.api.context.Context

interface Plugin<C: Context> {
	val name: String
	val description: String
		get() = "No description provided"
	val usage: String
		get() = "No usage provided"
	val commands: List<Command<*,*>>
}