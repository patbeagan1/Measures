package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Zeptometer(override val value: Double) : UnitDistance<Zeptometer> {
    override fun asType(d: Double) = Zeptometer(d);
    override fun toMeters() = Meters(value * Consts.ZEPTO)
}

fun UnitDistance<*>.toZeptometer() = toMeters().toUnit(Zeptometer(1.0))
