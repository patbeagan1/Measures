package com.measures.distance

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Millimeters(override val value: Double) : UnitDistance<Millimeters> {
    override fun asType(d: Double) = Millimeters(d)
    override fun toMeters() = Meters(this.value * 0.001)
}

fun Meters.asMillimeters() = toUnit(Millimeters(1.0))
fun UnitDistance<*>.toMillimeters() = toMeters().asMillimeters()