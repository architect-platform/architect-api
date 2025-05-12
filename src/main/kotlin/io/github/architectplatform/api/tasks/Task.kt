package io.github.architectplatform.api.tasks

import io.github.architectplatform.api.command.AbstractCommand
import io.github.architectplatform.api.command.CommandRequest
import io.github.architectplatform.api.command.CommandResult

abstract class Task<T : CommandResult> : AbstractCommand<T>() {
	abstract fun executeTask(path: String): T
	override fun execute(request: CommandRequest): T {
		return executeTask(request.path)
	}
}