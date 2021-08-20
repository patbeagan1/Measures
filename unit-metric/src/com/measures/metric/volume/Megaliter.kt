package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class Megaliter(override val value: Double) : UnitVolume<Megaliter> {
    override fun asType(d: Double) = Megaliter(d);
    override fun toLiters() = Liter(value * Consts.MEGA)
}

fun UnitVolume<*>.toMegaliter() = toLiters().toUnit(Megaliter(1.0))