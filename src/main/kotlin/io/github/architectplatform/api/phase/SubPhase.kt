package io.github.architectplatform.api.phase

interface SubPhase<P : Phase> : Phase {
	val phase: P?
}