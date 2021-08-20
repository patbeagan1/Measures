package com.measures.metric.volume

import com.measures.Consts
import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class Exaliter(override val value: Double) : UnitVolume<Exaliter> {
    override fun asType(d: Double) = Exaliter(d);
    override fun asBaseUnit() = Liter(value * Consts.EXA)
}

fun UnitVolume<*>.toExaliter() = toUnit(Exaliter(1.0))