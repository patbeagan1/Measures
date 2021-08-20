package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class Hectoliter(override val value: Double) : UnitVolume<Hectoliter> {
    override fun asType(d: Double) = Hectoliter(d);
    override fun toLiters() = Liter(value * Consts.HECTO)
}

fun UnitVolume<*>.toHectoliter() = toLiters().toUnit(Hectoliter(1.0))