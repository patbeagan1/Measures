package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Zettameter(override val value: Double) : UnitDistance<Zettameter> {
    override fun asType(d: Double) = Zettameter(d);
    override fun toMeters() = Meters(value * Consts.ZETTA)
}

fun UnitDistance<*>.toZettameter() = toMeters().toUnit(Zettameter(1.0))
