package io.github.architectplatform.api.core.tasks.phase

typealias PhaseId = String

interface Phase {
  val id: PhaseId

  fun parent(): Phase?

  fun depends(): List<PhaseId> = emptyList()
}
