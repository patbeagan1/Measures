package com.measures.metric.distance

import com.measures.Consts
import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Dekameter(override val value: Double) : UnitDistance<Dekameter> {
    override fun asType(d: Double) = Dekameter(d);
    override fun asBaseUnit() = Meters(value * Consts.DEKA)
}

fun UnitDistance<*>.toDekameter() = toUnit(Dekameter(1.0))
