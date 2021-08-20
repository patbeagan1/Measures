package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class Deciliter(override val value: Double) : UnitVolume<Deciliter> {
    override fun asType(d: Double) = Deciliter(d);
    override fun toLiters() = Liter(value * Consts.DECI)
}

fun UnitVolume<*>.toDeciliter() = toLiters().toUnit(Deciliter(1.0))