package com.measures.volume.fluid

import com.measures.volume.UnitVolume

@JvmInline
value class USCup(override val value: Double) : UnitVolume<USCup> {
    override fun asType(d: Double) = USCup(d);
    override fun toLiters() = USFluidPint(value / 2.0).toLiters()
}