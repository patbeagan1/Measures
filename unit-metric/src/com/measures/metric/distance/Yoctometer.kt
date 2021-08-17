package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Yoctometer(override val value: Double) : UnitDistance<Yoctometer> {
    override fun asType(d: Double) = Yoctometer(d);
    override fun toMeters() = Meters(value * Consts.YOCTO)
}

fun Meters.asYoctometer() = toUnit(Yoctometer(1.0))
fun UnitDistance<*>.toYoctometer() = toMeters().asYoctometer()