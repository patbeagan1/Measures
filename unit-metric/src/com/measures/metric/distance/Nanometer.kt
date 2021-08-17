package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Nanometer(override val value: Double) : UnitDistance<Nanometer> {
    override fun asType(d: Double) = Nanometer(d);
    override fun toMeters() = Meters(value * Consts.NANO)
}

fun Meters.asNanometer() = toUnit(Nanometer(1.0))
fun UnitDistance<*>.toNanometer() = toMeters().asNanometer()
