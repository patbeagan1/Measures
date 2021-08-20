package com.measures.imperial.volume.fluid

import com.measures.imperial.volume.UnitVolume

@JvmInline
value class USHogshead(override val value: Double) : UnitVolume<USHogshead> {
    override fun asType(d: Double) = USHogshead(d);
    override fun asBaseUnit() = USFluidGallon(value * 63.0).asBaseUnit()
}

fun UnitVolume<*>.toUSHogshead() = toUnit(USHogshead(1.0))