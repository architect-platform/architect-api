package io.github.architectplatform.api.tasks.verify

import io.github.architectplatform.api.tasks.Task

/**
 * A task that verifies a project.
 *
 * @see Task
 * @see VerifyTaskCommandResult
 */
interface VerifyTask : Task<VerifyTaskCommandResult>
