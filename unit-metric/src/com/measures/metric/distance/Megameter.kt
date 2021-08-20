package com.measures.metric.distance

import com.measures.Consts
import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Megameter(override val value: Double) : UnitDistance<Megameter> {
    override fun asType(d: Double) = Megameter(d);
    override fun asBaseUnit() = Meters(value * Consts.MEGA)
}

fun UnitDistance<*>.toMegameter() = toUnit(Megameter(1.0))
