package io.github.architectplatform.api.plugins

import io.github.architectplatform.api.phase.Phase
import io.github.architectplatform.api.phase.PhaseExecutorTask
import io.github.architectplatform.api.tasks.TaskRegistry

abstract class WorkflowPlugin(override val id: String, private val phases: List<Phase>) : ArchitectPlugin<Void> {
	override val contextClass: Class<Void> = Void::class.java
	override val contextKey: String = ""

	override fun register(registry: TaskRegistry) {
		phases.forEach { phase ->
			registry.add(PhaseExecutorTask(phase, registry))
		}
	}
}

