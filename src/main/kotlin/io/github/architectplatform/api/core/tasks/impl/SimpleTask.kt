package io.github.architectplatform.api.core.tasks.impl

import io.github.architectplatform.api.core.tasks.phase.Phase
import io.github.architectplatform.api.core.project.ProjectContext
import io.github.architectplatform.api.core.tasks.Task
import io.github.architectplatform.api.core.tasks.TaskResult

class SimpleTask(
	override val id: String,
	private val phase: Phase,
	private val task: (ProjectContext) -> TaskResult,
) : Task {
	override fun phase(): Phase = phase

	override fun execute(ctx: ProjectContext, args: List<String>): TaskResult {
		return task(ctx)
	}
}

