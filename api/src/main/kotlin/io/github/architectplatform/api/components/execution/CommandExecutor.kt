package io.github.architectplatform.api.components.execution

interface CommandExecutor {
  fun execute(command: String, workingDir: String? = null)
}
