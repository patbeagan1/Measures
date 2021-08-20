package com.measures.metric.distance

import com.measures.Consts
import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Decimeter(override val value: Double) : UnitDistance<Decimeter> {
    override fun asType(d: Double) = Decimeter(d);
    override fun asBaseUnit() = Meters(value * Consts.DECI)
}

fun UnitDistance<*>.toDecimeter() = toUnit(Decimeter(1.0))
