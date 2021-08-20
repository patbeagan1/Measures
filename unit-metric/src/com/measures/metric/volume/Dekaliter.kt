package com.measures.metric.volume

import com.measures.Consts
import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class Dekaliter(override val value: Double) : UnitVolume<Dekaliter> {
    override fun asType(d: Double) = Dekaliter(d);
    override fun asBaseUnit() = Liter(value * Consts.DEKA)
}

fun UnitVolume<*>.toDekaliter() = toUnit(Dekaliter(1.0))