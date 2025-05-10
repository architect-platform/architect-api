package io.github.architectplatform.api.tasks

import io.github.architectplatform.api.command.Command
import io.github.architectplatform.api.command.CommandResult

interface Task<T: CommandResult>: Command<T>