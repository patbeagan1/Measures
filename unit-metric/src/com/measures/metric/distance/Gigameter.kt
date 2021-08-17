package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Gigameter(override val value: Double) : UnitDistance<Gigameter> {
    override fun asType(d: Double) = Gigameter(d);
    override fun toMeters() = Meters(value * Consts.GIGA)
}

fun Meters.asGigameter() = toUnit(Gigameter(1.0))
fun UnitDistance<*>.toGigameter() = toMeters().asGigameter()
