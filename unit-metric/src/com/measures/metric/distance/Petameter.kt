package com.measures.metric.distance

import com.measures.Consts
import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Petameter(override val value: Double) : UnitDistance<Petameter> {
    override fun asType(d: Double) = Petameter(d);
    override fun asBaseUnit() = Meters(value * Consts.PETA)
}

fun UnitDistance<*>.toPetameter() = toUnit(Petameter(1.0))
