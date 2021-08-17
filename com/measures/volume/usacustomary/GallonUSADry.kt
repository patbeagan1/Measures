package com.measures.volume.usacustomary

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class GallonUSADry(override val value: Double) : UnitVolume<GallonUSADry> {
    override fun asType(d: Double) = GallonUSADry(d)
    override fun toLiters() = Liters(value * 0.004404884 * 1000)
}