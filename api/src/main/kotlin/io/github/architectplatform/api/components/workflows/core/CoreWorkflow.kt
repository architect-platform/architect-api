package io.github.architectplatform.api.components.workflows.core

import io.github.architectplatform.api.core.tasks.phase.Phase
import io.github.architectplatform.api.core.tasks.phase.PhaseId

/**
 * Core phases in the project lifecycle.
 */
enum class CoreWorkflow(override val id: String, private val dependsOn: List<PhaseId> = emptyList()) : Phase {

	INIT("init"),
	LINT("lint", listOf("init")),
	VERIFY("verify", listOf("lint")),
	BUILD("build", listOf("verify")),
	RUN("run", listOf("build")),
	TEST("test", listOf("build")),
	RELEASE("release", listOf("test")),
	PUBLISH("publish", listOf("release"));

	override fun depends(): List<PhaseId> {
		return dependsOn
	}
	override fun parent(): Phase? {
		return null // CoreWorkflow does not have a parent phase
	}
}
