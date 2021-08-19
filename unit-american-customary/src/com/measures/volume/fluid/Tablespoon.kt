package com.measures.volume.fluid

import com.measures.volume.UnitVolume

@JvmInline
value class Tablespoon(override val value: Double) : UnitVolume<Tablespoon> {
    override fun asType(d: Double) = Tablespoon(d);
    override fun toLiters() = USFluidOunce(value / 2.0).toLiters()
}