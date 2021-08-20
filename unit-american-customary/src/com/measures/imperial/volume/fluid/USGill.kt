package com.measures.imperial.volume.fluid

import com.measures.imperial.volume.UnitVolume

@JvmInline
value class USGill(override val value: Double) : UnitVolume<USGill> {
    override fun asType(d: Double) = USGill(d);
    override fun asBaseUnit() = USCup(value / 2.0).asBaseUnit()
}

fun UnitVolume<*>.toUSGill() = toUnit(USGill(1.0))
