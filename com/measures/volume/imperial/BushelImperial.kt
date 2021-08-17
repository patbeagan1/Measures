package com.measures.volume.imperial

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class BushelImperial(override val value: Double) : UnitVolume<BushelImperial> {
    override fun asType(d: Double) = BushelImperial(d)
    override fun toLiters() = Liters(value * 0.03636872 * 1000)
}