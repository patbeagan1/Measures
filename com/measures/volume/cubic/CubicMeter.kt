package com.measures.volume.cubic

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class CubicMeter(override val value: Double) : UnitVolume<CubicMeter> {
    override fun asType(d: Double) = CubicMeter(d)
    override fun toLiters() = Liters(value * 1 * 1000)
}