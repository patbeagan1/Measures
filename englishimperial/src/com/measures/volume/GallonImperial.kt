package com.measures.volume

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class GallonImperial(override val value: Double) : UnitVolume<GallonImperial> {
    override fun asType(d: Double) = GallonImperial(d)
    override fun toLiters() = Liters(value * 0.00454609 * 1000)
}

fun Liters.asGallonImperial() = toUnit(GallonImperial(1.0))
fun UnitVolume<*>.toGallonImperial() = toLiters().asGallonImperial()