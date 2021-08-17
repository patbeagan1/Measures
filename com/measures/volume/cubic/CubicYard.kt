package com.measures.volume.cubic

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class CubicYard(override val value: Double) : UnitVolume<CubicYard> {
    override fun asType(d: Double) = CubicYard(d)
    override fun toLiters() = Liters(value * 0.764554858 * 1000)
}