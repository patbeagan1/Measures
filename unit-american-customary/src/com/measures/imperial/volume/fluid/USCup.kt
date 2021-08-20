package com.measures.imperial.volume.fluid

import com.measures.imperial.volume.UnitVolume

@JvmInline
value class USCup(override val value: Double) : UnitVolume<USCup> {
    override fun asType(d: Double) = USCup(d);
    override fun asBaseUnit() = USFluidPint(value / 2.0).asBaseUnit()
}

fun UnitVolume<*>.toUSCup() = toUnit(USCup(1.0))
