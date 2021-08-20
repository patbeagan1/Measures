package com.measures.metric.distance

import com.measures.Consts
import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Zettameter(override val value: Double) : UnitDistance<Zettameter> {
    override fun asType(d: Double) = Zettameter(d);
    override fun asBaseUnit() = Meters(value * Consts.ZETTA)
}

fun UnitDistance<*>.toZettameter() = toUnit(Zettameter(1.0))
