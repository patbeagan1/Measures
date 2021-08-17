package com.measures.volume.imperial

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class OunceImperialFluid(override val value: Double) : UnitVolume<OunceImperialFluid> {
    override fun asType(d: Double) = OunceImperialFluid(d)
    override fun toLiters() = Liters(value * 2.84131E-05 * 1000)
}