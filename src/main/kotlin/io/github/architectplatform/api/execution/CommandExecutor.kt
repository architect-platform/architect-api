package io.github.architectplatform.api.execution

interface CommandExecutor {
	fun execute(command: String, workingDir: String? = null)
}
