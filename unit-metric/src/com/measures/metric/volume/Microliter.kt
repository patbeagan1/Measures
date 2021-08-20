package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class Microliter(override val value: Double) : UnitVolume<Microliter> {
    override fun asType(d: Double) = Microliter(d);
    override fun toLiters() = Liter(value * Consts.MICRO)
}

fun UnitVolume<*>.toMicroliter() = toUnit(Microliter(1.0))