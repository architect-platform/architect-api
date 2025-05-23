package io.github.architectplatform.api.phase

import io.github.architectplatform.api.plugins.ArchitectPlugin
import io.github.architectplatform.api.tasks.TaskRegistry

abstract class SubWorkflowPlugin<P : Phase>(
	override val id: String,
	private val phases: List<SubPhase<P>>,
) : ArchitectPlugin {
	override fun register(registry: TaskRegistry) {
		phases.forEach { phase ->
			registry.add(SubPhaseExecutorTask(phase, registry))
		}
	}
}