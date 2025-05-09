package io.github.architectplatform.api.tasks.run

import io.github.architectplatform.api.tasks.Task

/**
 * A task that runs a project.
 *
 * @see Task
 * @see RunTaskCommandResult
 */
interface RunTask : Task<RunTaskCommandResult>
