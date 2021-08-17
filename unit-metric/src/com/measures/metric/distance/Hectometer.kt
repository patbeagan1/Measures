package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Hectometer(override val value: Double) : UnitDistance<Hectometer> {
    override fun asType(d: Double) = Hectometer(d);
    override fun toMeters() = Meters(value * Consts.HECTO)
}

fun Meters.asHectometer() = toUnit(Hectometer(1.0))
fun UnitDistance<*>.toHectometer() = toMeters().asHectometer()
