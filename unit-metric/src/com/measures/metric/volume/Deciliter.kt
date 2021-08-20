package com.measures.metric.volume

import com.measures.Consts
import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class Deciliter(override val value: Double) : UnitVolume<Deciliter> {
    override fun asType(d: Double) = Deciliter(d);
    override fun asBaseUnit() = Liter(value * Consts.DECI)
}

fun UnitVolume<*>.toDeciliter() = toUnit(Deciliter(1.0))