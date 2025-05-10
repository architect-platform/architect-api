package io.github.architectplatform.api.tasks.test

import io.github.architectplatform.api.tasks.Task

/**
 * A task that runs tests in a project.
 *
 * @see Task
 * @see TestTaskResult
 */
interface TestTask : Task<TestTaskResult>
