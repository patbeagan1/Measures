package com.measures.metric.distance

import com.measures.Consts
import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Kilometer(override val value: Double) : UnitDistance<Kilometer> {
    override fun asType(d: Double) = Kilometer(d);
    override fun asBaseUnit() = Meters(value * Consts.KILO)
}

fun UnitDistance<*>.toKilometer() = toUnit(Kilometer(1.0))
