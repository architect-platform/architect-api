package io.github.architectplatform.api.phase

import io.github.architectplatform.api.tasks.Task

interface PhaseTask : Task {
	val phase: Phase
}