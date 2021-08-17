package com.measures.volume.imperial

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class PeckImperial(override val value: Double) : UnitVolume<PeckImperial> {
    override fun asType(d: Double) = PeckImperial(d)
    override fun toLiters() = Liters(value * 0.00909218 * 1000)
}