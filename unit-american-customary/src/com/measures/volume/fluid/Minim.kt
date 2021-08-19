package com.measures.volume.fluid

import com.measures.volume.UnitVolume

@JvmInline
value class Minim(override val value: Double) : UnitVolume<Minim> {
    override fun asType(d: Double) = Minim(d);
    override fun toLiters() = USFluidDram(value / 60.0).toLiters()
}