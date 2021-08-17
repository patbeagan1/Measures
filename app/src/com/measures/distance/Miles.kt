package com.measures.distance

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Miles(override val value: Double) : UnitDistance<Miles> {
    override fun asType(d: Double) = Miles(d)
    override fun toMeters() = Meters(this.value * 1609.344)
}

fun Meters.asMiles() = toUnit(Miles(1.0))
fun UnitDistance<*>.toMiles() = toMeters().asMiles()