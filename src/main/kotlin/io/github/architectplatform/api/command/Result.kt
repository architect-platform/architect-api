package io.github.architectplatform.api.command

interface Result {
	val success: Boolean
}

object EmptyResult : Result {
	override val success: Boolean
		get() = true
}