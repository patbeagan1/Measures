package com.measures.distance

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Yards(override val value: Double) : UnitDistance<Yards> {
    override fun asType(d: Double) = Yards(d)
    override fun toMeters() = Meters(this.value * 0.9144)
}

fun Meters.asYards() = toUnit(Yards(1.0))
fun UnitDistance<*>.toYards() = toMeters().asYards()