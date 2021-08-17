package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Deciliter(override val value: Double) : UnitVolume<Deciliter> {
    override fun asType(d: Double) = Deciliter(d);
    override fun toLiters() = Liters(value * Consts.DECI)
}

fun Liters.asDeciliter() = toUnit(Deciliter(1.0))
fun UnitVolume<*>.toDeciliter() = toLiters().asDeciliter()