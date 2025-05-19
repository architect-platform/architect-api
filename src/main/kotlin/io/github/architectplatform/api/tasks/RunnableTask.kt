package io.github.architectplatform.api.tasks

import io.github.architectplatform.api.project.ProjectContext

class RunnableTask(
	override val id: String,
	private val task: (ProjectContext) -> TaskResult,
) : Task {
	override fun execute(ctx: ProjectContext): TaskResult = task(ctx)
}