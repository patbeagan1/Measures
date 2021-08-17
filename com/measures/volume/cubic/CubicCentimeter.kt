package com.measures.volume.cubic

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class CubicCentimeter(override val value: Double) : UnitVolume<CubicCentimeter> {
    override fun asType(d: Double) = CubicCentimeter(d)
    override fun toLiters() = Liters(value * 0.000001 * 1000)
}