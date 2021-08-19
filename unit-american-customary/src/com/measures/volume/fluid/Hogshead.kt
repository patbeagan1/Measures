package com.measures.volume.fluid

import com.measures.volume.UnitVolume

@JvmInline
value class Hogshead(override val value: Double) : UnitVolume<Hogshead> {
    override fun asType(d: Double) = Hogshead(d);
    override fun toLiters() = USFluidGallon(value * 63.0).toLiters()
}