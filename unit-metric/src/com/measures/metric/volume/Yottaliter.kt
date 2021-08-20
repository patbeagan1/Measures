package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class Yottaliter(override val value: Double) : UnitVolume<Yottaliter> {
    override fun asType(d: Double) = Yottaliter(d);
    override fun toLiters() = Liter(value * Consts.YOTTA)
}

fun UnitVolume<*>.toYottaliter() = toLiters().toUnit(Yottaliter(1.0))