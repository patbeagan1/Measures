package com.measures.metric.distance

import com.measures.Consts
import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Centimeter(override val value: Double) : UnitDistance<Centimeter> {
    override fun asType(d: Double) = Centimeter(d);
    override fun asBaseUnit() = Meters(value * Consts.CENTI)
}

fun UnitDistance<*>.toCentimeter() = toUnit(Centimeter(1.0))
