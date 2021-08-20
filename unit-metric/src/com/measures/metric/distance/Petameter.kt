package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Petameter(override val value: Double) : UnitDistance<Petameter> {
    override fun asType(d: Double) = Petameter(d);
    override fun toMeters() = Meters(value * Consts.PETA)
}

fun UnitDistance<*>.toPetameter() = toMeters().toUnit(Petameter(1.0))
