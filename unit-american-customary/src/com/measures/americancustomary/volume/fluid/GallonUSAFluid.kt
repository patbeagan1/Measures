package com.measures.americancustomary.volume.fluid

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class GallonUSAFluid(override val value: Double) : UnitVolume<GallonUSAFluid> {
    override fun asType(d: Double) = GallonUSAFluid(d)
    override fun toLiters() = Liters(value * 0.003785412 * 1000)
}

fun Liters.asGallonUSAFluid() = toUnit(GallonUSAFluid(1.0))
fun UnitVolume<*>.toGallonUSAFluid() = toLiters().asGallonUSAFluid()