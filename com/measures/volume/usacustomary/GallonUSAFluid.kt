package com.measures.volume.usacustomary

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class GallonUSAFluid(override val value: Double) : UnitVolume<GallonUSAFluid> {
    override fun asType(d: Double) = GallonUSAFluid(d)
    override fun toLiters() = Liters(value * 0.003785412 * 1000)
}