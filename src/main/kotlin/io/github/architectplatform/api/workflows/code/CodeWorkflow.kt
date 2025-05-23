package io.github.architectplatform.api.workflows.code

import io.github.architectplatform.api.phase.SubPhase
import io.github.architectplatform.api.workflows.core.CoreWorkflow

/**
 * Code asset sub-phases.
 */
enum class CodeWorkflow(
	override val parent: CoreWorkflow,
	override val phaseName: String = parent.phaseName,
) : SubPhase<CoreWorkflow> {

	INIT(CoreWorkflow.INIT),
	LINT(CoreWorkflow.LINT),
	VERIFY(CoreWorkflow.VERIFY),
	BUILD(CoreWorkflow.BUILD),
	TEST(CoreWorkflow.TEST),
	RUN(CoreWorkflow.RUN),
	RELEASE(CoreWorkflow.RELEASE),
}

