package com.measures.volume.cubic

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class CubicMile(override val value: Double) : UnitVolume<CubicMile> {
    override fun asType(d: Double) = CubicMile(d)
    override fun toLiters() = Liters(value * 4168181825 * 1000)
}