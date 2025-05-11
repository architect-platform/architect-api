package io.github.architectplatform.api.tasks.build

import io.github.architectplatform.api.tasks.Task

/**
 * A task that builds a project.
 *
 * @see Task
 * @see BuildTaskResult
 */
abstract class BuildTask : Task<BuildTaskResult>()
