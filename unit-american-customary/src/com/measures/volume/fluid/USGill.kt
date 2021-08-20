package com.measures.volume.fluid

import com.measures.volume.UnitVolume

@JvmInline
value class USGill(override val value: Double) : UnitVolume<USGill> {
    override fun asType(d: Double) = USGill(d);
    override fun toLiters() = USCup(value / 2.0).toLiters()
}

fun UnitVolume<*>.toUSGill() = toLiters().toUnit(USGill(1.0))
