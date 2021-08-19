package com.measures.englishinternational.distance

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Mile(override val value: Double) : UnitDistance<Mile> {
    override fun asType(d: Double) = Mile(d);
    override fun toMeters() = Yard(value * 1760.0).toMeters()
}

fun Meters.asMile() = toUnit(Mile(1.0))
fun UnitDistance<*>.toMile() = toMeters().asMile()
