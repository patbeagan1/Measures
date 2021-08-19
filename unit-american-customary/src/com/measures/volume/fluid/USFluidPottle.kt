package com.measures.volume.fluid

import com.measures.volume.UnitVolume

@JvmInline
value class USFluidPottle(override val value: Double) : UnitVolume<USFluidPottle> {
    override fun asType(d: Double) = USFluidPottle(d);
    override fun toLiters() = USFluidQuart(value * 2.0).toLiters()
}