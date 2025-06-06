package io.github.architectplatform.api.core.tasks

import io.github.architectplatform.api.core.project.ProjectContext

interface TaskContext {
  val projectContext: ProjectContext
}
