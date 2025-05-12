package io.github.architectplatform.api.phases.commitmsg

import io.github.architectplatform.api.phases.PhaseResult

open class CommitMsgPhaseResult(success: Boolean, output: String) : PhaseResult(success, output) {
	companion object {
		fun success(output: String): CommitMsgPhaseResult {
			return CommitMsgPhaseResult(true, output)
		}

		fun failure(output: String): CommitMsgPhaseResult {
			return CommitMsgPhaseResult(false, output)
		}
	}
}