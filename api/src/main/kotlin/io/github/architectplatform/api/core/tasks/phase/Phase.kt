package io.github.architectplatform.api.core.tasks.phase

typealias PhaseId = String

interface Phase {
  val id: PhaseId

  fun description(): String = "No description provided for phase $id"

  fun parent(): Phase?

  fun depends(): List<PhaseId> = emptyList()
}
