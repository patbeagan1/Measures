package com.measures.metric.distance

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Kilometers(override val value: Double) : UnitDistance<Kilometers> {
    override fun asType(d: Double) = Kilometers(d)
    override fun toMeters() = Meters(this.value * 1000.0)
}

fun Meters.asKilometers() = toUnit(Kilometers(1.0))
fun UnitDistance<*>.toKilometers() = toMeters().asKilometers()