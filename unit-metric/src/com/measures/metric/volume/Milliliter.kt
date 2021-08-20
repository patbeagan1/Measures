package com.measures.metric.volume

import com.measures.Consts.MILLI
import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class Milliliter(override val value: Double) : UnitVolume<Milliliter> {
    override fun asType(d: Double) = Milliliter(d);
    override fun toLiters() = Liter(value * MILLI)
}

fun UnitVolume<*>.toMilliliter() = toLiters().toUnit(Milliliter(1.0))