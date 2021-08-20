package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Kilometer(override val value: Double) : UnitDistance<Kilometer> {
    override fun asType(d: Double) = Kilometer(d);
    override fun toMeters() = Meters(value * Consts.KILO)
}

fun UnitDistance<*>.toKilometer() = toMeters().toUnit(Kilometer(1.0))
