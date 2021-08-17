package com.measures.volume.cubic

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class CubicFoot(override val value: Double) : UnitVolume<CubicFoot> {
    override fun asType(d: Double) = CubicFoot(d)
    override fun toLiters() = Liters(value * 0.028316847 * 1000)
}