package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Megameter(override val value: Double) : UnitDistance<Megameter> {
    override fun asType(d: Double) = Megameter(d);
    override fun toMeters() = Meters(value * Consts.MEGA)
}

fun Meters.asMegameter() = toUnit(Megameter(1.0))
fun UnitDistance<*>.toMegameter() = toMeters().asMegameter()
