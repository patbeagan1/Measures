package com.measures.imperial.volume.fluid

import com.measures.imperial.volume.UnitVolume

@JvmInline
value class USFluidPottle(override val value: Double) : UnitVolume<USFluidPottle> {
    override fun asType(d: Double) = USFluidPottle(d);
    override fun asBaseUnit() = USFluidQuart(value * 2.0).asBaseUnit()
}

fun UnitVolume<*>.toUSFluidPottle() = toUnit(USFluidPottle(1.0))
