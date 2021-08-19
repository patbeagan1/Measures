package com.measures.volume.fluid

import com.measures.volume.UnitVolume

@JvmInline
value class USFluidGallon(override val value: Double) : UnitVolume<USFluidGallon> {
    override fun asType(d: Double) = USFluidGallon(d);
    override fun toLiters() = USFluidQuart(value * 4.0).toLiters()
}