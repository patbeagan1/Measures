package com.measures.americancustomary.distance

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Mile(override val value: Double) : UnitDistance<Mile> {
    override fun asType(d: Double) = Mile(d);
    override fun toMeters() = (Yard(1760.0) * value).toMeters()
}

fun Meters.asMile() = toUnit(Mile(1.0))
fun UnitDistance<*>.toMile() = toMeters().asMile()
