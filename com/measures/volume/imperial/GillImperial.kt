package com.measures.volume.imperial

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class GillImperial(override val value: Double) : UnitVolume<GillImperial> {
    override fun asType(d: Double) = GillImperial(d)
    override fun toLiters() = Liters(value * 0.000142065 * 1000)
}