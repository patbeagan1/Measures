package com.measures.volume.usacustomary

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class PintUSADry(override val value: Double) : UnitVolume<PintUSADry> {
    override fun asType(d: Double) = PintUSADry(d)
    override fun toLiters() = Liters(value * 0.00055061 * 1000)
}