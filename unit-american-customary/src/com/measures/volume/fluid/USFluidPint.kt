package com.measures.volume.fluid

import com.measures.volume.UnitVolume

@JvmInline
value class USFluidPint(override val value: Double) : UnitVolume<USFluidPint> {
    override fun asType(d: Double) = USFluidPint(d);
    override fun toLiters() = USFluidQuart(value / 2.0).toLiters()
}