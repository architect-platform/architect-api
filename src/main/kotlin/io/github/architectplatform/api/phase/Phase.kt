package io.github.architectplatform.api.phase

interface Phase {
	val phaseName: String
	val parent: Phase?
}

