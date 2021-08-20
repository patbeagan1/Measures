package com.measures.metric.distance

import com.measures.Consts
import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Yottameter(override val value: Double) : UnitDistance<Yottameter> {
    override fun asType(d: Double) = Yottameter(d);
    override fun asBaseUnit() = Meters(value * Consts.YOTTA)
}

fun UnitDistance<*>.toYottameter() = toUnit(Yottameter(1.0))