package io.github.architectplatform.api.assets

import io.github.architectplatform.api.core.CorePhases
import io.github.architectplatform.api.phase.SubPhase

/**
 * Interface for asset-specific sub-phases; each has a parent core Phase.
 */
interface AssetCorePhase : SubPhase<CorePhases>


