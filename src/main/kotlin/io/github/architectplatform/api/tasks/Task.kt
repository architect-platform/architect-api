package io.github.architectplatform.api.tasks

import io.github.architectplatform.api.command.Command
import io.github.architectplatform.api.command.EmptyRequest

interface Task<T: TaskResult>: Command<EmptyRequest, T>