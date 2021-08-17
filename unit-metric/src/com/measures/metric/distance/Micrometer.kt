package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Micrometer(override val value: Double) : UnitDistance<Micrometer> {
    override fun asType(d: Double) = Micrometer(d);
    override fun toMeters() = Meters(value * Consts.MICRO)
}

fun Meters.asMicrometer() = toUnit(Micrometer(1.0))
fun UnitDistance<*>.toMicrometer() = toMeters().asMicrometer()
