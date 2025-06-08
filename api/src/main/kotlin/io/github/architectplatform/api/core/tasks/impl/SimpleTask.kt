package io.github.architectplatform.api.core.tasks.impl

import io.github.architectplatform.api.core.project.ProjectContext
import io.github.architectplatform.api.core.tasks.Environment
import io.github.architectplatform.api.core.tasks.Task
import io.github.architectplatform.api.core.tasks.TaskResult
import io.github.architectplatform.api.core.tasks.phase.Phase

class SimpleTask(
    override val id: String,
    private val description: String,
    private val phase: Phase,
    private val task: (Environment, ProjectContext) -> TaskResult,
) : Task {
  override fun phase(): Phase = phase

  override fun description(): String = description

  override fun execute(
      environment: Environment,
      projectContext: ProjectContext,
      args: List<String>
  ): TaskResult {
    return task(environment, projectContext)
  }
}
