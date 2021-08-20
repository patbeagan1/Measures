package com.measures.imperial.volume.fluid

import com.measures.imperial.volume.UnitVolume

@JvmInline
value class USFluidPint(override val value: Double) : UnitVolume<USFluidPint> {
    override fun asType(d: Double) = USFluidPint(d);
    override fun asBaseUnit() = USFluidQuart(value / 2.0).asBaseUnit()
}

fun UnitVolume<*>.toUSFluidPint() = toUnit(USFluidPint(1.0))
