package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Decimeter(override val value: Double) : UnitDistance<Decimeter> {
    override fun asType(d: Double) = Decimeter(d);
    override fun toMeters() = Meters(value * Consts.DECI)
}

fun UnitDistance<*>.toDecimeter() = toMeters().toUnit(Decimeter(1.0))
