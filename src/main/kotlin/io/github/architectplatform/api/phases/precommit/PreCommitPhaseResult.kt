package io.github.architectplatform.api.phases.precommit

import io.github.architectplatform.api.phases.PhaseResult

open class PreCommitPhaseResult(success: Boolean, output: String) : PhaseResult(success, output) {
	companion object {
		fun success(output: String): PreCommitPhaseResult {
			return PreCommitPhaseResult(true, output)
		}

		fun failure(output: String): PreCommitPhaseResult {
			return PreCommitPhaseResult(false, output)
		}
	}
}