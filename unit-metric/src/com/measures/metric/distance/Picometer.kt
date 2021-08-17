package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Picometer(override val value: Double) : UnitDistance<Picometer> {
    override fun asType(d: Double) = Picometer(d);
    override fun toMeters() = Meters(value * Consts.PICO)
}

fun Meters.asPicometer() = toUnit(Picometer(1.0))
fun UnitDistance<*>.toPicometer() = toMeters().asPicometer()