package com.measures.metric.distance

import com.measures.Consts
import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Hectometer(override val value: Double) : UnitDistance<Hectometer> {
    override fun asType(d: Double) = Hectometer(d);
    override fun asBaseUnit() = Meters(value * Consts.HECTO)
}

fun UnitDistance<*>.toHectometer() = toUnit(Hectometer(1.0))
