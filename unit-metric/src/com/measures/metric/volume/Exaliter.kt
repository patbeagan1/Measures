package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class Exaliter(override val value: Double) : UnitVolume<Exaliter> {
    override fun asType(d: Double) = Exaliter(d);
    override fun toLiters() = Liter(value * Consts.EXA)
}

fun UnitVolume<*>.toExaliter() = toLiters().toUnit(Exaliter(1.0))