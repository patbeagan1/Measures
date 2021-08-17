package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Millimeter(override val value: Double) : UnitDistance<Millimeter> {
    override fun asType(d: Double) = Millimeter(d);
    override fun toMeters() = Meters(value * Consts.MILLI)
}

fun Meters.asMillimeter() = toUnit(Millimeter(1.0))
fun UnitDistance<*>.toMillimeter() = toMeters().asMillimeter()
