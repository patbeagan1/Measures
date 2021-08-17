package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Femtometer(override val value: Double) : UnitDistance<Femtometer> {
    override fun asType(d: Double) = Femtometer(d);
    override fun toMeters() = Meters(value * Consts.FEMTO)
}

fun Meters.asFemtometer() = toUnit(Femtometer(1.0))
fun UnitDistance<*>.toFemtometer() = toMeters().asFemtometer()