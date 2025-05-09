package io.github.architectplatform.api.command

interface CommandRequest

/**
 * An empty request object that can be used as a default value for requests that do not require any parameters.
 */
object EmptyCommandRequest : CommandRequest