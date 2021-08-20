package com.measures.metric.distance

import com.measures.Consts
import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Gigameter(override val value: Double) : UnitDistance<Gigameter> {
    override fun asType(d: Double) = Gigameter(d);
    override fun asBaseUnit() = Meters(value * Consts.GIGA)
}

fun UnitDistance<*>.toGigameter() = toUnit(Gigameter(1.0))
