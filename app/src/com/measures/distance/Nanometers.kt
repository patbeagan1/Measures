package com.measures.distance

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Nanometers(override val value: Double) : UnitDistance<Nanometers> {
    override fun asType(d: Double) = Nanometers(d)
    override fun toMeters() = Meters(this.value * 0.000000001)
}

fun Meters.asNanometers() = toUnit(Nanometers(1.0))
fun UnitDistance<*>.toNanometers() = toMeters().asNanometers()