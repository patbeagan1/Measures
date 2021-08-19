package com.measures.volume.fluid

import com.measures.volume.UnitVolume

@JvmInline
value class Teaspoon(override val value: Double) : UnitVolume<Teaspoon> {
    override fun asType(d: Double) = Teaspoon(d);
    override fun toLiters() = Tablespoon(value / 3.0).toLiters()
}