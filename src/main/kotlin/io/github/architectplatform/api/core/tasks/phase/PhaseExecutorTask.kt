package io.github.architectplatform.api.core.tasks.phase

import io.github.architectplatform.api.core.project.ProjectContext
import io.github.architectplatform.api.core.tasks.Task
import io.github.architectplatform.api.core.tasks.TaskRegistry
import io.github.architectplatform.api.core.tasks.TaskResult

class PhaseExecutorTask(val phase: Phase, private val registry: TaskRegistry) : Task {
	override val id: String = phase.phaseName

	override fun phase(): Phase? = phase.parent

	override fun execute(ctx: ProjectContext, args: List<String>): TaskResult {
		println("$id-executor: Executing phase: $phase")
		val children = registry.all().filter { it.phase()?.phaseName == phase.phaseName }

		println("$id-executor: Found ${children.size} tasks for phase: $phase")
		val results = children.map { task ->
			println("$id-executor: Executing task: ${task.id}")
			val taskResult = task.execute(ctx, args)
			println("$id-executor: Finished executing task: ${task.id} with result: ${taskResult.success}")
			taskResult
		}

		println("$id-executor: Finished executing phase: $phase")
		return TaskResult.success("Executed phase: $phase", results = results)
	}

	override fun toString(): String {
		return "PhaseExecutorTask(id='$id', phase=$phase)"
	}
}

