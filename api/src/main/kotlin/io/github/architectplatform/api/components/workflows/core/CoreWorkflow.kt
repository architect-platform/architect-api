package io.github.architectplatform.api.components.workflows.core

import io.github.architectplatform.api.core.tasks.phase.Phase
import io.github.architectplatform.api.core.tasks.phase.PhaseId

/** Core phases in the project lifecycle. */
enum class CoreWorkflow(
    override val id: String,
    private val description: String,
    private val dependsOn: List<PhaseId> = emptyList(),
) : Phase {

  INIT("init", "Initialize the project"),
  LINT("lint", "Lint the project", listOf("init")),
  VERIFY("verify", "Verify the project", listOf("lint")),
  BUILD("build", "Build the project", listOf("verify")),
  RUN("run", "Run the project", listOf("build")),
  TEST("test", "Test the project", listOf("build")),
  RELEASE("release", "Release the project", listOf("test")),
  PUBLISH("publish", "Publish the project", listOf("release"));

  override fun description(): String = description

  override fun depends(): List<PhaseId> {
    return dependsOn
  }

  override fun parent(): Phase? {
    return null // CoreWorkflow does not have a parent phase
  }
}
