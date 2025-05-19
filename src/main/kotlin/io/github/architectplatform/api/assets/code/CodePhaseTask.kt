package io.github.architectplatform.api.assets.code

import io.github.architectplatform.api.phase.PhaseTask

interface CodePhaseTask : PhaseTask {
	override val phase: CodePhases
}