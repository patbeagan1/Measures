package com.measures.imperial.volume.fluid

import com.measures.imperial.volume.UnitVolume

@JvmInline
value class USFluidOunce(override val value: Double) : UnitVolume<USFluidOunce> {
    override fun asType(d: Double) = USFluidOunce(d);
    override fun asBaseUnit() = USCup(value / 8.0).asBaseUnit()
}

fun UnitVolume<*>.toUSFluidOunce() = toUnit(USFluidOunce(1.0))
