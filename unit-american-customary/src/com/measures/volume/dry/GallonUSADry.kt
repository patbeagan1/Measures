package com.measures.volume.dry

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class GallonUSADry(override val value: Double) : UnitVolume<GallonUSADry> {
    override fun asType(d: Double) = GallonUSADry(d)
    override fun toLiters() = Liters(value * 0.004404884 * 1000)
}

fun Liters.asGallonUSADry() = toUnit(GallonUSADry(1.0))
fun UnitVolume<*>.toGallonUSADry() = toLiters().asGallonUSADry()