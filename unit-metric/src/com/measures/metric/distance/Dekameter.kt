package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Dekameter(override val value: Double) : UnitDistance<Dekameter> {
    override fun asType(d: Double) = Dekameter(d);
    override fun toMeters() = Meters(value * Consts.DEKA)
}

fun UnitDistance<*>.toDekameter() = toMeters().toUnit(Dekameter(1.0))
