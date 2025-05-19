package io.github.architectplatform.api.assets.code

import io.github.architectplatform.api.assets.AssetCorePhase
import io.github.architectplatform.api.core.CorePhases

/**
 * Code asset sub-phases.
 */
enum class CodePhases(
	override val phase: CorePhases?, override val phaseName: String = phase?.phaseName ?: "unnamed task",
) : AssetCorePhase {
	BUILD(CorePhases.BUILD),
	TEST(CorePhases.TEST),
	RUN(CorePhases.RUN),
	RELEASE(CorePhases.RELEASE),
}

