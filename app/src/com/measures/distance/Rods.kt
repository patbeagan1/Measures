package com.measures.distance

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Rods(override val value: Double) : UnitDistance<Rods> {
    override fun asType(d: Double) = Rods(d)
    override fun toMeters() = Meters(this.value * 5.0292)
}

fun Meters.asRods() = toUnit(Rods(1.0))
fun UnitDistance<*>.toRods() = toMeters().asRods()