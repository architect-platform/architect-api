package io.github.architectplatform.api.workflows.core

import io.github.architectplatform.api.phase.Phase

/**
 * Core phases in the project lifecycle.
 */
enum class CoreWorkflow(override val phaseName: String) : Phase {

	INIT("init"),
	LINT("lint"),
	VERIFY("verify"),
	BUILD("build"),
	RUN("run"),
	TEST("test"),
	RELEASE("release");

	override val parent: Phase? = null
}
