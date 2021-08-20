package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class Gigaliter(override val value: Double) : UnitVolume<Gigaliter> {
    override fun asType(d: Double) = Gigaliter(d);
    override fun toLiters() = Liter(value * Consts.GIGA)
}

fun UnitVolume<*>.toGigaliter() = toLiters().toUnit(Gigaliter(1.0))