package com.byd.tripstats.ui.theme

import androidx.compose.ui.graphics.Color

// ── BYD Sealion 7 Performance — Dark UI Palette ───────────────────────────────
// Carbon/graphite cockpit base with a single sapphire signature accent, in place
// of the stock DiLink "Ocean" navy-and-neon-cyan look. Same token names as before
// so every screen that reads MaterialTheme.colorScheme.* / these constants picks
// the new palette up automatically — only the hex values changed.

// Primary accent — Sapphire, used on active buttons, sliders, highlights
val BydElectricBlue      = Color(0xFF5B9DFF)   // ← was #00CCFF (neon cyan)
val BydElectricBlueDim   = Color(0xFF3D6FCC)   // slightly dimmed for containers
val BydElectricBlueDeep  = Color(0xFF0F1B33)   // deep container background
val BydOnElectricBlue    = Color(0xFF00101F)   // near-black text/icons on the accent

// Secondary accent — Performance Emerald, used for energy flow, regen indicators
val BydEcoTeal           = Color(0xFF1FCB8C)   // ← was #00FAD9 (neon aqua)
val BydEcoTealDim        = Color(0xFF17A473)
val BydEcoTealDeep       = Color(0xFF0C2A22)
val BydOnEcoTeal         = Color(0xFF04140F)

// Tertiary — Arctic Blue (muted steel-blue, used for softer accents)
val BydArcticBlue        = Color(0xFF79B5CE)
val BydArcticBlueDeep    = Color(0xFF1A3A4A)

// Backgrounds — carbon-fibre / graphite cockpit layers, not navy
val BydStatusBar         = Color(0xFF07080A)   // top bar / deepest layer
val BydBackground        = Color(0xFF0B0C10)   // ← was #08101A (navy) — carbon black
val BydSurface           = Color(0xFF15171D)   // ← was #182540 (blue-navy) — graphite panel
val BydSurfaceVariant    = Color(0xFF1B1E26)   // ← was #1D2E4C
val BydSurfaceHigh       = Color(0xFF232732)   // ← was #253858

// Text
val BydTextPrimary       = Color(0xFFF4F5F7)   // soft off-white, less clinical than pure white
val BydTextSecondary     = Color(0xFF98A0AE)   // muted graphite grey for sub-text / disabled
val BydTextOnDark        = Color(0xFF00101F)   // dark text for use on bright accents

// Outline / dividers — neutral graphite, not blue-grey
val BydOutline           = Color(0xFF3A3F4B)   // ← was #3B4A5E
val BydOutlineVariant    = Color(0xFF262A33)   // ← was #2A3648

// ── BYD Sealion 7 Performance — Light UI Palette ──────────────────────────────
// Aurora White bodywork + deep sapphire, richer/more saturated than the stock
// cobalt so it still reads "performance" in daylight.

val BydOceanBlue         = Color(0xFF1E5FD6)   // ← was #2E74D4 — deeper sapphire
val BydOceanBlueLight    = Color(0xFFE3EAF5)   // ← was #DEEAF7
val BydOceanBlueDark     = Color(0xFF0B2038)   // ← was #0D2A4A
val BydSecondaryLight         = Color(0xFF52799E)   // ← was #5B8DB8
val BydSecondaryLightContainer = Color(0xFFE5EBF3)
val BydAuroraWhite       = Color(0xFFF7F7F8)   // ← was #F5F7F9 — neutral, less blue-tinted
val BydAtlantisGrey      = Color(0xFF374151)
val BydSurfaceLight      = Color(0xFFFFFFFF)
val BydSurfaceVariantLight = Color(0xFFF4F8FC)
val BydOutlineLight      = Color(0xFF8FA3B8)
val BydOutlineVariantLight = Color(0xFFCDD8E3)

// The actual interactive button color used in both themes:
val BydElectricAzure        = Color(0xFF3D7FFF)   // ← was #2196F3 — richer sapphire, segment buttons/toggles/active tabs
val BydElectricAzureDeep    = Color(0xFF14213D)   // ← was #0D2340 — deep container / deep variant

// ── Toggle / Switch unchecked state ──────────────────────────────────────────
val ToggleUncheckedTrack  = Color(0xFFBDBDBD)   // light silver track when off — matches native BYD toggle
val ToggleUncheckedThumb  = Color(0xFFF5F5F5)   // near-white thumb when off — matches native BYD toggle

// ── Semantic / functional colors (shared across themes) ───────────────────────

// Energy / EV telemetry
val BatteryBlue          = Color(0xFF3D7FFF)   // ← was #2196F3, unified with BydElectricAzure
val RegenGreen           = Color(0xFF2FBE6F)   // ← was #4CAF50 — deeper performance emerald
val AccelerationOrange   = Color(0xFFFF8A3D)   // ← was #FF9800 — refined performance orange
val ChargingYellow       = Color(0xFFF2B33D)   // ← was #FFC107 — brushed gold, not crayon-yellow

// Trip-tag palette — auto-assigned by colorIndex. Must have at least TAG_PALETTE_SIZE
// (8) entries; tagColor() wraps defensively if a stored index ever exceeds the list.
val TagPalette = listOf(
    Color(0xFF4C8DFF),   // blue
    Color(0xFF34B575),   // green
    Color(0xFFE3A73E),   // amber
    Color(0xFFE0574F),   // red
    Color(0xFF9B6BC7),   // purple
    Color(0xFF3FB8CC),   // cyan
    Color(0xFFE07A45),   // deep orange
    Color(0xFFD9548F)    // pink
)

fun tagColor(colorIndex: Int): androidx.compose.ui.graphics.Color = TagPalette[colorIndex.mod(TagPalette.size)]

// Motor chart — muted lavender-steel for front motor, pairs with BydElectricAzure (rear)
val MotorViolet          = Color(0xFF9C8CE0)   // ← was #A78BFA

// ── Power metrics — Range & Distance ────────────────────────────────────────
// Slot A  → Amber Gold: warm, "how far can I go" feel; distinct from AccelerationOrange
val IndigoDark       = Color(0xFFE3A73E)   // ← was #FFB300 — refined gold for dark theme
val IndigoLight      = Color(0xFFB8701A)   // ← was #E65100 — deep burnt-amber for light theme

// Slot B → Indigo Periwinkle: calm, "how far have I gone" feel; distinct from all blues
val AmberDark       = Color(0xFF8B96D9)   // ← was #7986CB — soft periwinkle for dark theme
val AmberLight      = Color(0xFF34408F)   // ← was #3949AB — deep indigo for light theme

// Slot C → Rose Coral: warm pink-red; distinct from error red and acceleration orange
val RoseCoralDark        = Color(0xFFE895AA)   // ← was #F48FB1 — soft rose for dark theme
val RoseCoralLight       = Color(0xFFA8184F)   // ← was #C2185B — deep magenta-rose for light theme

// Range → Lime Chartreuse: yellow-green; distinct from RegenGreen and EcoTeal
val LimeChartreuseDark   = Color(0xFFC4D65A)   // ← was #D4E157 — muted lime for dark theme
val LimeChartreuseLight  = Color(0xFF8A8A1E)   // ← was #9E9D24 — olive-lime for light theme

// Error — vivid red replacing Material 3's default pinkish error
val BydErrorRed          = Color(0xFFE5484D)   // ← was #E53935 — warmer, less "material default"
val BydErrorRedLight     = Color(0xFFFF6E72)   // ← was #FF6B6B — brighter for dark backgrounds
val BydErrorContainer    = Color(0xFF7F0000)
val BydErrorContainerLight = Color(0xFFFFDAD6)
val BydOnErrorContainer  = Color(0xFFFFDAD6)
val BydOnErrorContainerLight = Color(0xFF410002)
