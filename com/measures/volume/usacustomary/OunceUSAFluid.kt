package com.measures.volume.usacustomary

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class OunceUSAFluid(override val value: Double) : UnitVolume<OunceUSAFluid> {
    override fun asType(d: Double) = OunceUSAFluid(d)
    override fun toLiters() = Liters(value * 2.95735E-05 * 1000)
}