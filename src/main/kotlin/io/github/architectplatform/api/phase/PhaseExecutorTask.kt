package io.github.architectplatform.api.phase

import io.github.architectplatform.api.project.ProjectContext
import io.github.architectplatform.api.tasks.Task
import io.github.architectplatform.api.tasks.TaskRegistry
import io.github.architectplatform.api.tasks.TaskResult

class PhaseExecutorTask(val phase: Phase, private val registry: TaskRegistry) : Task {
	override val id: String = phase.phaseName

	override fun phase(): Phase? = phase.parent

	override fun execute(ctx: ProjectContext): TaskResult {
		println("$id-executor: Executing phase: $phase")
		val children = registry.all().filter { it.phase()?.phaseName == phase.phaseName }

		println("$id-executor: Found ${children.size} tasks for phase: $phase")
		children.forEach {
			println("$id-executor: Executing task: ${it.id}")
			val result = it.execute(ctx)
			println("$id-executor: Finished executing task: ${it.id} with result: $result")
		}

		println("$id-executor: Finished executing phase: $phase")
		return TaskResult.success("Executed phase: $phase")
	}

	override fun toString(): String {
		return "PhaseExecutorTask(id='$id', phase=$phase)"
	}
}

