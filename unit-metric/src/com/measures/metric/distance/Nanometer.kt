package com.measures.metric.distance

import com.measures.Consts
import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Nanometer(override val value: Double) : UnitDistance<Nanometer> {
    override fun asType(d: Double) = Nanometer(d);
    override fun asBaseUnit() = Meters(value * Consts.NANO)
}

fun UnitDistance<*>.toNanometer() = toUnit(Nanometer(1.0))
