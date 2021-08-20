package com.measures.other

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Mils(override val value: Double) : UnitDistance<Mils> {
    override fun asType(d: Double) = Mils(d)
    override fun toMeters() = Meters(this.value * 0.0000254)
}

fun UnitDistance<*>.toMils() = toMeters().toUnit(Mils(1.0))