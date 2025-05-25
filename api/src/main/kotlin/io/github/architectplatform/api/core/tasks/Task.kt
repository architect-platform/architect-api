package io.github.architectplatform.api.core.tasks

import io.github.architectplatform.api.core.tasks.phase.Phase
import io.github.architectplatform.api.core.project.ProjectContext

/**
 * Core abstraction for a unit of work. Plugins register Activities tied to an AssetPhase.
 */
interface Task {
	val id: String
	fun phase(): Phase? = null
	fun execute(ctx: ProjectContext, args: List<String> = emptyList()): TaskResult
}

