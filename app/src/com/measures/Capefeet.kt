package com.measures

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Capefeet(override val value: Double) : UnitDistance<Capefeet> {
    override fun asType(d: Double) = Capefeet(d)
    override fun toMeters() = Meters(this.value * 0.314856)
}

fun Meters.asCapefeet() = toUnit(Capefeet(1.0))
fun UnitDistance<*>.toCapefeet() = toMeters().asCapefeet()