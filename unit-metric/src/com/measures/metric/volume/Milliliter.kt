package com.measures.metric.volume

import com.measures.Consts.MILLI
import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class Milliliter(override val value: Double) : UnitVolume<Milliliter> {
    override fun asType(d: Double) = Milliliter(d);
    override fun asBaseUnit() = Liter(value * MILLI)
}

fun UnitVolume<*>.toMilliliter() = toUnit(Milliliter(1.0))