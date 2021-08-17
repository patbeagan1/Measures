package com.measures.volume.usacustomary

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class QuartUSADry(override val value: Double) : UnitVolume<QuartUSADry> {
    override fun asType(d: Double) = QuartUSADry(d)
    override fun toLiters() = Liters(value * 0.001101221 * 1000)
}