package com.measures.metric.distance

import com.measures.Consts
import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Femtometer(override val value: Double) : UnitDistance<Femtometer> {
    override fun asType(d: Double) = Femtometer(d);
    override fun asBaseUnit() = Meters(value * Consts.FEMTO)
}

fun UnitDistance<*>.toFemtometer() = toUnit(Femtometer(1.0))