package io.github.architectplatform.api.executor


interface CommandExecutor {
	fun execute(command: String, workingDir: String? = null)
}

