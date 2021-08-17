package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Exaliter(override val value: Double) : UnitVolume<Exaliter> {
    override fun asType(d: Double) = Exaliter(d);
    override fun toLiters() = Liters(value * Consts.EXA)
}

fun Liters.asExaliter() = toUnit(Exaliter(1.0))
fun UnitVolume<*>.toExaliter() = toLiters().asExaliter()