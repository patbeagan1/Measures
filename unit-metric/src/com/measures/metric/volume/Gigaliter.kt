package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Gigaliter(override val value: Double) : UnitVolume<Gigaliter> {
    override fun asType(d: Double) = Gigaliter(d);
    override fun toLiters() = Liters(value * Consts.GIGA)
}

fun Liters.asGigaliter() = toUnit(Gigaliter(1.0))
fun UnitVolume<*>.toGigaliter() = toLiters().asGigaliter()