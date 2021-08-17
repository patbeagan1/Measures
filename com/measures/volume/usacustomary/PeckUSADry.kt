package com.measures.volume.usacustomary

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class PeckUSADry(override val value: Double) : UnitVolume<PeckUSADry> {
    override fun asType(d: Double) = PeckUSADry(d)
    override fun toLiters() = Liters(value * 0.008809768 * 1000)
}