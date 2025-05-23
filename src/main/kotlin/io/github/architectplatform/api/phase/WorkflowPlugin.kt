package io.github.architectplatform.api.phase

import io.github.architectplatform.api.plugins.ArchitectPlugin
import io.github.architectplatform.api.tasks.TaskRegistry

abstract class WorkflowPlugin(override val id: String, private val phases: List<Phase>) : ArchitectPlugin {
	override fun register(registry: TaskRegistry) {
		phases.forEach { phase ->
			registry.add(PhaseExecutorTask(phase, registry))
		}
	}
}

