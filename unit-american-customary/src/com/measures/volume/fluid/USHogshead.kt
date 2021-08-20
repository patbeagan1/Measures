package com.measures.volume.fluid

import com.measures.volume.UnitVolume

@JvmInline
value class USHogshead(override val value: Double) : UnitVolume<USHogshead> {
    override fun asType(d: Double) = USHogshead(d);
    override fun toLiters() = USFluidGallon(value * 63.0).toLiters()
}

fun UnitVolume<*>.toUSHogshead() = toLiters().toUnit(USHogshead(1.0))