package io.github.architectplatform.api.core.project

import java.nio.file.Path

/** Provides contextual services and config for Activities. */
data class ProjectContext(val dir: Path, val config: Config)
