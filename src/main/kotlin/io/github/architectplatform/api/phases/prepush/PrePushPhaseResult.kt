package io.github.architectplatform.api.phases.prepush

import io.github.architectplatform.api.phases.PhaseResult

open class PrePushPhaseResult(success: Boolean, output: String) : PhaseResult(success, output) {
	companion object {
		fun success(output: String): PrePushPhaseResult {
			return PrePushPhaseResult(true, output)
		}

		fun failure(output: String): PrePushPhaseResult {
			return PrePushPhaseResult(false, output)
		}
	}
}