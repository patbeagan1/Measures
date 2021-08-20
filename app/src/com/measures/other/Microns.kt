package com.measures.other

import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Microns(override val value: Double) : UnitDistance<Microns> {
    override fun asType(d: Double) = Microns(d)
    override fun asBaseUnit() = Meters(this.value * 0.000001)
}

fun UnitDistance<*>.toMicrons() = toUnit(Microns(1.0))