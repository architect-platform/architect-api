package io.github.architectplatform.api.tasks

import io.github.architectplatform.api.command.Command
import io.github.architectplatform.api.command.EmptyCommandRequest

interface Task<T: TaskCommandResult>: Command<EmptyCommandRequest, T>