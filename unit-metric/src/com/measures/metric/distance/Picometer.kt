package com.measures.metric.distance

import com.measures.Consts
import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Picometer(override val value: Double) : UnitDistance<Picometer> {
    override fun asType(d: Double) = Picometer(d);
    override fun asBaseUnit() = Meters(value * Consts.PICO)
}

fun UnitDistance<*>.toPicometer() = toUnit(Picometer(1.0))
