package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Yottameter(override val value: Double) : UnitDistance<Yottameter> {
    override fun asType(d: Double) = Yottameter(d);
    override fun toMeters() = Meters(value * Consts.YOTTA)
}

fun UnitDistance<*>.toYottameter() = toMeters().toUnit(Yottameter(1.0))