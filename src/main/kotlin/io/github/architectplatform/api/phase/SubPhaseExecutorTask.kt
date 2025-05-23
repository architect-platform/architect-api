package io.github.architectplatform.api.phase

import io.github.architectplatform.api.project.ProjectContext
import io.github.architectplatform.api.tasks.TaskRegistry
import io.github.architectplatform.api.tasks.TaskResult

class SubPhaseExecutorTask<P : SubPhase<X>, X : Phase>(
	override val phase: X,
	private val registry: TaskRegistry,
) : PhaseTask<X> {
	override val id: String = phase.phaseName

	override fun execute(ctx: ProjectContext): TaskResult {
		println("$id-executor: Executing sub-phase: $phase")
		val children = registry.all().filterIsInstance<PhaseTask<P>>()
			.filter { it.phase == phase }

		println("$id-executor: Found ${children.size} tasks for sub-phase: $phase")

		children.forEach {
			println("$id-executor: Executing task: ${it.id}")
			val result = it.execute(ctx)
			println("$id-executor: Finished executing task: ${it.id} with result: $result")
		}

		println("$id-executor: Finished executing tasks for sub-phase: $phase")
		return TaskResult.success("Executed sub-phase: $phase")
	}

	override fun toString(): String {
		return "SubPhaseExecutorTask(id='$id', subPhase=$phase)"
	}
}