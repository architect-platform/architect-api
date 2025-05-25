package io.github.architectplatform.api.components.workflows.hooks

import io.github.architectplatform.api.core.tasks.phase.Phase

/**
 * Code asset sub-phases.
 */
enum class HooksWorkflow(override val phaseName: String) : Phase {
	PRE_COMMIT("pre-commit"),
	PRE_PUSH("pre-push"),
	COMMIT_MSG("commit-msg");

	override val parent: Phase? = null
}

