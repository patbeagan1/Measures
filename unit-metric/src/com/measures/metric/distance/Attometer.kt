package com.measures.metric.distance

import com.measures.Consts
import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Attometer(override val value: Double) : UnitDistance<Attometer> {
    override fun asType(d: Double) = Attometer(d);
    override fun asBaseUnit() = Meters(value * Consts.ATTO)
}

fun UnitDistance<*>.toAttometer() = toUnit(Attometer(1.0))
