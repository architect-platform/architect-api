package io.github.architectplatform.api.interfaces

import java.util.Collections.emptyList

data class ApiCommandRequest(
	val name: String,
	val args: List<String> = emptyList()
)

