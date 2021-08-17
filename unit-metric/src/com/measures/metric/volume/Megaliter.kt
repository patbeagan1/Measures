package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Megaliter(override val value: Double) : UnitVolume<Megaliter> {
    override fun asType(d: Double) = Megaliter(d);
    override fun toLiters() = Liters(value * Consts.MEGA)
}

fun Liters.asMegaliter() = toUnit(Megaliter(1.0))
fun UnitVolume<*>.toMegaliter() = toLiters().asMegaliter()