package io.github.architectplatform.api.tasks.build

import io.github.architectplatform.api.tasks.Task

/**
 * A task that builds a project.
 *
 * @see Task
 * @see BuildCommandResult
 */
interface BuildTask : Task<BuildCommandResult>
