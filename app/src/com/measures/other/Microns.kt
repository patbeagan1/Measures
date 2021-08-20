package com.measures.other

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Microns(override val value: Double) : UnitDistance<Microns> {
    override fun asType(d: Double) = Microns(d)
    override fun toMeters() = Meters(this.value * 0.000001)
}

fun UnitDistance<*>.toMicrons() = toMeters().toUnit(Microns(1.0))