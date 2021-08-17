package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Centimeter(override val value: Double) : UnitDistance<Centimeter> {
    override fun asType(d: Double) = Centimeter(d);
    override fun toMeters() = Meters(value * Consts.CENTI)
}

fun Meters.asCentimeter() = toUnit(Centimeter(1.0))
fun UnitDistance<*>.toCentimeter() = toMeters().asCentimeter()
