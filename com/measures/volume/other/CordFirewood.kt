package com.measures.volume.other

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class CordFirewood(override val value: Double) : UnitVolume<CordFirewood> {
    override fun asType(d: Double) = CordFirewood(d)
    override fun toLiters() = Liters(value * 3.624556364 * 1000)
}