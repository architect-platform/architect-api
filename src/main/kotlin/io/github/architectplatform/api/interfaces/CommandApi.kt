package io.github.architectplatform.api.interfaces

interface CommandApi {
	fun execute(request: ApiCommandRequest): ApiCommandResponse
}