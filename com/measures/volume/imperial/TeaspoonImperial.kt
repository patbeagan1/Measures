package com.measures.volume.imperial

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class TeaspoonImperial(override val value: Double) : UnitVolume<TeaspoonImperial> {
    override fun asType(d: Double) = TeaspoonImperial(d)
    override fun toLiters() = Liters(value * 5.91939E-06 * 1000)
}