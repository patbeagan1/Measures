package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Centimeter(override val value: Double) : UnitDistance<Centimeter> {
    override fun asType(d: Double) = Centimeter(d);
    override fun toMeters() = Meters(value * Consts.CENTI)
}

fun UnitDistance<*>.toCentimeter() = toMeters().toUnit(Centimeter(1.0))
