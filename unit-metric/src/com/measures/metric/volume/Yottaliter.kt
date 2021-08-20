package com.measures.metric.volume

import com.measures.Consts
import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class Yottaliter(override val value: Double) : UnitVolume<Yottaliter> {
    override fun asType(d: Double) = Yottaliter(d);
    override fun asBaseUnit() = Liter(value * Consts.YOTTA)
}

fun UnitVolume<*>.toYottaliter() = toUnit(Yottaliter(1.0))