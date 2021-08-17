package com.measures.distance

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Centimeters(override val value: Double) : UnitDistance<Centimeters> {
    override fun asType(d: Double) = Centimeters(d)
    override fun toMeters() = Meters(this.value * 0.01)
}

fun Meters.asCentimeters() = toUnit(Centimeters(1.0))
fun UnitDistance<*>.toCentimeters() = toMeters().asCentimeters()