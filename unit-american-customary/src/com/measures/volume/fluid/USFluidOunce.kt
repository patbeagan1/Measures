package com.measures.volume.fluid

import com.measures.volume.UnitVolume

@JvmInline
value class USFluidOunce(override val value: Double) : UnitVolume<USFluidOunce> {
    override fun asType(d: Double) = USFluidOunce(d);
    override fun toLiters() = USCup(value / 8.0).toLiters()
}