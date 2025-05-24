package io.github.architectplatform.api.tasks.impl

import io.github.architectplatform.api.phase.Phase
import io.github.architectplatform.api.project.ProjectContext
import io.github.architectplatform.api.tasks.Task
import io.github.architectplatform.api.tasks.TaskResult

class TaskWithArgs(
	override val id: String,
	private val phase: Phase,
	private val task: (ProjectContext, List<String>) -> TaskResult,
) : Task {
	override fun phase(): Phase = phase

	override fun execute(ctx: ProjectContext, args: List<String>): TaskResult {
		return task(ctx, args)
	}
}