package io.github.architectplatform.api.tasks.publish

import io.github.architectplatform.api.tasks.Task

/**
 * A task that publishes a project.
 *
 * @see Task
 * @see PublishTaskCommandResult
 */
interface PublishTask : Task<PublishTaskCommandResult>

