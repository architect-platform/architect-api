package io.github.architectplatform.api.components.workflows.core

import io.github.architectplatform.api.core.tasks.phase.Phase

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
	RELEASE("release"),
	PUBLISH("publish"),
	;

	override val parent: Phase? = null
}
