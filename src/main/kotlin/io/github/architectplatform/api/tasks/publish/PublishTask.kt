package io.github.architectplatform.api.tasks.publish

import io.github.architectplatform.api.tasks.Task

/**
 * A task that publishes a project.
 *
 * @see Task
 * @see PublishTaskResult
 */
interface PublishTask : Task<PublishTaskResult>

