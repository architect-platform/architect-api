package io.github.architectplatform.api.command

import io.github.architectplatform.api.context.Context

abstract class AbstractCommand<Res : CommandResult> : Command<Res> {

	var context: Context = emptyMap()

	override fun initialize(context: Context) {
		this.context = context
	}

}