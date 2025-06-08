package io.github.architectplatform.api.core.tasks

import io.github.architectplatform.api.core.project.ProjectContext
import io.github.architectplatform.api.core.tasks.phase.Phase

/** Core abstraction for a unit of work. Plugins register Activities tied to an AssetPhase. */
interface Task {
  val id: String

  fun description(): String = "No description provided for task $id"

  fun phase(): Phase? = null

  fun depends(): List<String> = phase()?.depends() ?: emptyList()

  fun execute(
      environment: Environment,
      projectContext: ProjectContext,
      args: List<String> = emptyList()
  ): TaskResult
}
