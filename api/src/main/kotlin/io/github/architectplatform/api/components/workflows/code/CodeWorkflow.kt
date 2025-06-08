package io.github.architectplatform.api.components.workflows.code

import io.github.architectplatform.api.components.workflows.core.CoreWorkflow
import io.github.architectplatform.api.core.tasks.phase.Phase

/** Code asset sub-phases. */
enum class CodeWorkflow(
    private val parent: CoreWorkflow,
    override val id: String = "CODE-" + parent.id,
) : Phase {

  INIT(CoreWorkflow.INIT),
  LINT(CoreWorkflow.LINT),
  VERIFY(CoreWorkflow.VERIFY),
  BUILD(CoreWorkflow.BUILD),
  TEST(CoreWorkflow.TEST),
  RUN(CoreWorkflow.RUN),
  RELEASE(CoreWorkflow.RELEASE),
  PUBLISH(CoreWorkflow.PUBLISH);

  override fun description(): String {
    return "Code workflow phase for ${parent.id} - $id"
  }

  override fun parent(): Phase {
    return parent
  }
}
