package com.measures.volume.usacustomary

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class QuartUSAFluid(override val value: Double) : UnitVolume<QuartUSAFluid> {
    override fun asType(d: Double) = QuartUSAFluid(d)
    override fun toLiters() = Liters(value * 0.000946353 * 1000)
}