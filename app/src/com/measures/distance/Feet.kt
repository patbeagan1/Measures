package com.measures.distance

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Feet(override val value: Double) : UnitDistance<Feet> {
    override fun asType(d: Double) = Feet(d)
    override fun toMeters() = Meters(this.value * 0.3048)
}

fun Meters.asFeet() = toUnit(Feet(1.0))
fun UnitDistance<*>.toFeet() = toMeters().asFeet()