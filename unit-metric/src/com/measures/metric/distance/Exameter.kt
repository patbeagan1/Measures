package com.measures.metric.distance

import com.measures.Consts
import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Exameter(override val value: Double) : UnitDistance<Exameter> {
    override fun asType(d: Double) = Exameter(d);
    override fun asBaseUnit() = Meters(value * Consts.EXA)
}

fun UnitDistance<*>.toExameter() = toUnit(Exameter(1.0))
