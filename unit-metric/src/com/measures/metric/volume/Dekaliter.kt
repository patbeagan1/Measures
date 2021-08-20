package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class Dekaliter(override val value: Double) : UnitVolume<Dekaliter> {
    override fun asType(d: Double) = Dekaliter(d);
    override fun toLiters() = Liter(value * Consts.DEKA)
}

fun UnitVolume<*>.toDekaliter() = toLiters().toUnit(Dekaliter(1.0))