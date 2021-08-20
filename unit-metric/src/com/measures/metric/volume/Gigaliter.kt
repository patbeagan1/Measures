package com.measures.metric.volume

import com.measures.Consts
import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class Gigaliter(override val value: Double) : UnitVolume<Gigaliter> {
    override fun asType(d: Double) = Gigaliter(d);
    override fun asBaseUnit() = Liter(value * Consts.GIGA)
}

fun UnitVolume<*>.toGigaliter() = toUnit(Gigaliter(1.0))