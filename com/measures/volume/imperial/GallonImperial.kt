package com.measures.volume.imperial

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class GallonImperial(override val value: Double) : UnitVolume<GallonImperial> {
    override fun asType(d: Double) = GallonImperial(d)
    override fun toLiters() = Liters(value * 0.00454609 * 1000)
}