package io.github.architectplatform.api.phases

import io.github.architectplatform.api.command.AbstractCommand

abstract class Phase<T : PhaseResult> : AbstractCommand<T>()