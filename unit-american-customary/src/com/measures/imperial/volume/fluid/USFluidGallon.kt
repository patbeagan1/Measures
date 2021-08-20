package com.measures.imperial.volume.fluid

import com.measures.imperial.volume.UnitVolume

@JvmInline
value class USFluidGallon(override val value: Double) : UnitVolume<USFluidGallon> {
    override fun asType(d: Double) = USFluidGallon(d);
    override fun asBaseUnit() = USFluidQuart(value * 4.0).asBaseUnit()
}

fun UnitVolume<*>.toUSFluidGallon() = toUnit(USFluidGallon(1.0))
