package io.github.architectplatform.api.components.workflows.core

import io.github.architectplatform.api.core.tasks.phase.Phase

/**
 * Core phases in the project lifecycle.
 */
enum class CoreWorkflow(override val id: String) : Phase {

	INIT("init"),
	LINT("lint"),
	VERIFY("verify"),
	BUILD("build"),
	RUN("run"),
	TEST("test"),
	RELEASE("release"),
	PUBLISH("publish"),
	;

	override fun parent(): Phase? {
		return null // CoreWorkflow does not have a parent phase
	}
}
