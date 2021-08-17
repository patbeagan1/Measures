package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Microliter(override val value: Double) : UnitVolume<Microliter> {
    override fun asType(d: Double) = Microliter(d);
    override fun toLiters() = Liters(value * Consts.MICRO)
}

fun Liters.asMicroliter() = toUnit(Microliter(1.0))
fun UnitVolume<*>.toMicroliter() = toLiters().asMicroliter()