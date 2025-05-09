package io.github.architectplatform.api.command

interface Command<Req: Request, Res: Result> {

	val name: String

	val description: String
		get() = "No description provided"
	val usage: String
		get() = "No usage provided"

	fun execute(request: Req): Res
}
