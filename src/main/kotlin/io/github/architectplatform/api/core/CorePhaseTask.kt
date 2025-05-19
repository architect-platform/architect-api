package io.github.architectplatform.api.core

import io.github.architectplatform.api.phase.PhaseTask

interface CorePhaseTask : PhaseTask {
	override val phase: CorePhases
}