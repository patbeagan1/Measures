package com.measures.volume.imperial

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class QuartImperial(override val value: Double) : UnitVolume<QuartImperial> {
    override fun asType(d: Double) = QuartImperial(d)
    override fun toLiters() = Liters(value * 0.001136523 * 1000)
}