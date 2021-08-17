package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Dekaliter(override val value: Double) : UnitVolume<Dekaliter> {
    override fun asType(d: Double) = Dekaliter(d);
    override fun toLiters() = Liters(value * Consts.DEKA)
}

fun Liters.asDekaliter() = toUnit(Dekaliter(1.0))
fun UnitVolume<*>.toDekaliter() = toLiters().asDekaliter()