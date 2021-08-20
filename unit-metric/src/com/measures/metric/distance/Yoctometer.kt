package com.measures.metric.distance

import com.measures.Consts
import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Yoctometer(override val value: Double) : UnitDistance<Yoctometer> {
    override fun asType(d: Double) = Yoctometer(d);
    override fun asBaseUnit() = Meters(value * Consts.YOCTO)
}

fun UnitDistance<*>.toYoctometer() = toUnit(Yoctometer(1.0))