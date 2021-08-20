package com.measures.metric.volume

import com.measures.Consts
import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class Hectoliter(override val value: Double) : UnitVolume<Hectoliter> {
    override fun asType(d: Double) = Hectoliter(d);
    override fun asBaseUnit() = Liter(value * Consts.HECTO)
}

fun UnitVolume<*>.toHectoliter() = toUnit(Hectoliter(1.0))