package io.github.architectplatform.api.command

data class CommandRequest(val path: String, val args: List<String> = emptyList())
