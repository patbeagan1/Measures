package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Micrometer(override val value: Double) : UnitDistance<Micrometer> {
    override fun asType(d: Double) = Micrometer(d);
    override fun toMeters() = Meters(value * Consts.MICRO)
}

fun UnitDistance<*>.toMicrometer() = toMeters().toUnit(Micrometer(1.0))
