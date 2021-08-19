package com.measures.volume.fluid

import com.measures.volume.UnitVolume

@JvmInline
value class USFluidDram(override val value: Double) : UnitVolume<USFluidDram> {
    override fun asType(d: Double) = USFluidDram(d);
    override fun toLiters() = Teaspoon(value * 0.75).toLiters()
}