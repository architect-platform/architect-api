package io.github.architectplatform.api.tasks.release

import io.github.architectplatform.api.tasks.Task

/**
 * A task that releases a project.
 *
 * @see Task
 * @see ReleaseTaskCommandResult
 */
interface ReleaseTask : Task<ReleaseTaskCommandResult>

