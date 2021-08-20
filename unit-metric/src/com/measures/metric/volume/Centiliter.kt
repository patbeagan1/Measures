package com.measures.metric.volume

import com.measures.Consts
import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class Centiliter(override val value: Double) : UnitVolume<Centiliter> {
    override fun asType(d: Double) = Centiliter(d);
    override fun asBaseUnit() = Liter(value * Consts.CENTI)
}

fun UnitVolume<*>.toCentiliter() = toUnit(Centiliter(1.0))