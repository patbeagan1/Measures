package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Attometer(override val value: Double) : UnitDistance<Attometer> {
    override fun asType(d: Double) = Attometer(d);
    override fun toMeters() = Meters(value * Consts.ATTO)
}

fun UnitDistance<*>.toAttometer() = toMeters().toUnit(Attometer(1.0))
