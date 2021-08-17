package com.measures.volume.imperial

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class BarrelImperial(override val value: Double) : UnitVolume<BarrelImperial> {
    override fun asType(d: Double) = BarrelImperial(d)
    override fun toLiters() = Liters(value * 0.16365924 * 1000)
}