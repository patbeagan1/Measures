package com.measures.volume.usacustomary

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class BushelUSADry(override val value: Double) : UnitVolume<BushelUSADry> {
    override fun asType(d: Double) = BushelUSADry(d)
    override fun toLiters() = Liters(value * 0.03523907 * 1000)
}