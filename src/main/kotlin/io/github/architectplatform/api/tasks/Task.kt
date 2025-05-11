package io.github.architectplatform.api.tasks

import io.github.architectplatform.api.command.AbstractCommand
import io.github.architectplatform.api.command.CommandResult

abstract class Task<T : CommandResult> : AbstractCommand<T>()