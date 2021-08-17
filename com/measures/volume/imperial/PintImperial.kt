package com.measures.volume.imperial

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class PintImperial(override val value: Double) : UnitVolume<PintImperial> {
    override fun asType(d: Double) = PintImperial(d)
    override fun toLiters() = Liters(value * 0.000568261 * 1000)
}