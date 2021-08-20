package com.measures.metric.volume

import com.measures.Consts
import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class Megaliter(override val value: Double) : UnitVolume<Megaliter> {
    override fun asType(d: Double) = Megaliter(d);
    override fun asBaseUnit() = Liter(value * Consts.MEGA)
}

fun UnitVolume<*>.toMegaliter() = toUnit(Megaliter(1.0))