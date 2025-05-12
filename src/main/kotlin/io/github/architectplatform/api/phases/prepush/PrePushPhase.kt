package io.github.architectplatform.api.phases.prepush

import io.github.architectplatform.api.phases.Phase
import io.github.architectplatform.api.phases.precommit.PreCommitPhaseResult
import io.github.architectplatform.api.tasks.Task

/**
 * A task that builds a project.
 *
 * @see Task
 * @see PreCommitPhaseResult
 */
abstract class PrePushPhase : Phase<PrePushPhaseResult>()
