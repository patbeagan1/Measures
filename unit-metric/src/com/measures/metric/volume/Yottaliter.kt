package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Yottaliter(override val value: Double) : UnitVolume<Yottaliter> {
    override fun asType(d: Double) = Yottaliter(d);
    override fun toLiters() = Liters(value * Consts.YOTTA)
}

fun Liters.asYottaliter() = toUnit(Yottaliter(1.0))
fun UnitVolume<*>.toYottaliter() = toLiters().asYottaliter()