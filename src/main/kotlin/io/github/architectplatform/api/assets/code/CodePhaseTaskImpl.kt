package io.github.architectplatform.api.assets.code

import io.github.architectplatform.api.project.ProjectContext
import io.github.architectplatform.api.tasks.TaskResult

class CodePhaseTaskImpl(
	override val id: String,
	override val phase: CodePhases,
	private val task: (ProjectContext) -> TaskResult,
) : CodePhaseTask {
	override fun execute(ctx: ProjectContext): TaskResult = task(ctx)
	override fun toString(): String {
		return "CodePhaseTaskImpl(id='$id', phase=$phase)"
	}
}