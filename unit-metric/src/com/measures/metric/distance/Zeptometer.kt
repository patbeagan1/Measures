package com.measures.metric.distance

import com.measures.Consts
import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Zeptometer(override val value: Double) : UnitDistance<Zeptometer> {
    override fun asType(d: Double) = Zeptometer(d);
    override fun asBaseUnit() = Meters(value * Consts.ZEPTO)
}

fun UnitDistance<*>.toZeptometer() = toUnit(Zeptometer(1.0))
