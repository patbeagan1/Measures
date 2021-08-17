package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Zeptometer(override val value: Double) : UnitDistance<Zeptometer> {
    override fun asType(d: Double) = Zeptometer(d);
    override fun toMeters() = Meters(value * Consts.ZEPTO)
}

fun Meters.asZeptometer() = toUnit(Zeptometer(1.0))
fun UnitDistance<*>.toZeptometer() = toMeters().asZeptometer()
