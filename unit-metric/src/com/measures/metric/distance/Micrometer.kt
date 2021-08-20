package com.measures.metric.distance

import com.measures.Consts
import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Micrometer(override val value: Double) : UnitDistance<Micrometer> {
    override fun asType(d: Double) = Micrometer(d);
    override fun asBaseUnit() = Meters(value * Consts.MICRO)
}

fun UnitDistance<*>.toMicrometer() = toUnit(Micrometer(1.0))
