package io.github.architectplatform.api.command

import io.github.architectplatform.api.context.Context

abstract class AbstractCommand<Res : CommandResult> : Command<Res> {

	var context: Context? = null
		private set

	override fun initialize(context: Context) {
		this.context = context
	}

}