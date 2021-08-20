package com.measures.metric.distance

import com.measures.Consts
import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Millimeter(override val value: Double) : UnitDistance<Millimeter> {
    override fun asType(d: Double) = Millimeter(d);
    override fun asBaseUnit() = Meters(value * Consts.MILLI)
}

fun UnitDistance<*>.toMillimeter() = toUnit(Millimeter(1.0))
