package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class Centiliter(override val value: Double) : UnitVolume<Centiliter> {
    override fun asType(d: Double) = Centiliter(d);
    override fun toLiters() = Liter(value * Consts.CENTI)
}

fun UnitVolume<*>.toCentiliter() = toLiters().toUnit(Centiliter(1.0))