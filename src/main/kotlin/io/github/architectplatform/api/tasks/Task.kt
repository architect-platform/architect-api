package io.github.architectplatform.api.tasks

import io.github.architectplatform.api.phase.Phase
import io.github.architectplatform.api.project.ProjectContext

/**
 * Core abstraction for a unit of work. Plugins register Activities tied to an AssetPhase.
 */
interface Task {
	val id: String
	fun phase(): Phase? = null
	fun execute(ctx: ProjectContext): TaskResult
}

