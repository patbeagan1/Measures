package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Exameter(override val value: Double) : UnitDistance<Exameter> {
    override fun asType(d: Double) = Exameter(d);
    override fun toMeters() = Meters(value * Consts.EXA)
}

fun Meters.asExameter() = toUnit(Exameter(1.0))
fun UnitDistance<*>.toExameter() = toMeters().asExameter()
