package io.github.architectplatform.api.components.workflows.code

import io.github.architectplatform.api.components.workflows.core.CoreWorkflow
import io.github.architectplatform.api.core.tasks.phase.Phase

/**
 * Code asset sub-phases.
 */
enum class CodeWorkflow(
	override val parent: CoreWorkflow,
	override val phaseName: String = "CODE-" + parent.phaseName,
) : Phase {

	INIT(CoreWorkflow.INIT),
	LINT(CoreWorkflow.LINT),
	VERIFY(CoreWorkflow.VERIFY),
	BUILD(CoreWorkflow.BUILD),
	TEST(CoreWorkflow.TEST),
	RUN(CoreWorkflow.RUN),
	RELEASE(CoreWorkflow.RELEASE),
	PUBLISH(CoreWorkflow.PUBLISH),
}

