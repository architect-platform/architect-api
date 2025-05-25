package io.github.architectplatform.api.core.tasks.phase

interface Phase {
	val phaseName: String
	val parent: Phase?
}

