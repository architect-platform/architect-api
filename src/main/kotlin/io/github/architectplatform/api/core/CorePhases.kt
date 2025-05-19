package io.github.architectplatform.api.core

import io.github.architectplatform.api.phase.Phase

/**
 * Core phases in the project lifecycle.
 */
enum class CorePhases(override val phaseName: String) : Phase {

	INIT("init"),
	BUILD("build"),
	RUN("run"),
	TEST("test"),
	RELEASE("release");

}