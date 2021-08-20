package com.measures.metric.volume

import com.measures.Consts
import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class Microliter(override val value: Double) : UnitVolume<Microliter> {
    override fun asType(d: Double) = Microliter(d);
    override fun asBaseUnit() = Liter(value * Consts.MICRO)
}

fun UnitVolume<*>.toMicroliter() = toUnit(Microliter(1.0))