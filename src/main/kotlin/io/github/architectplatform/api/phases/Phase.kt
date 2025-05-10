package io.github.architectplatform.api.phases

import io.github.architectplatform.api.command.Command
import io.github.architectplatform.api.command.CommandResult

interface Phase<T: PhaseResult>: Command<T>