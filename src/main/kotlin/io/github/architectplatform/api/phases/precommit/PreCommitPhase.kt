package io.github.architectplatform.api.phases.precommit

import io.github.architectplatform.api.phases.Phase
import io.github.architectplatform.api.tasks.Task

/**
 * A task that builds a project.
 *
 * @see Task
 * @see PreCommitPhaseResult
 */
interface PreCommitPhase : Phase<PreCommitPhaseResult>
