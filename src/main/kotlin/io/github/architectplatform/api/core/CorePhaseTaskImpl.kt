package io.github.architectplatform.api.core

import io.github.architectplatform.api.project.ProjectContext
import io.github.architectplatform.api.tasks.TaskResult

class CorePhaseTaskImpl(
	override val id: String,
	override val phase: CorePhases,
	private val task: (ProjectContext) -> TaskResult,
) : CorePhaseTask {
	override fun execute(ctx: ProjectContext): TaskResult = task(ctx)
}