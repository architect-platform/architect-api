package io.github.architectplatform.api.assets.docs

import io.github.architectplatform.api.assets.AssetCorePhase
import io.github.architectplatform.api.core.CorePhases

/**
 * Docs asset sub-phases.
 */
enum class DocsAssetCorePhases(override val phase: CorePhases?, override val phaseName: String) : AssetCorePhase {
	GENERATE(CorePhases.BUILD, "generateDocs"),
	PREVIEW(null, "previewDocs")
}