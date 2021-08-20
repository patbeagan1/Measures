package com.measures.other

import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Mils(override val value: Double) : UnitDistance<Mils> {
    override fun asType(d: Double) = Mils(d)
    override fun asBaseUnit() = Meters(this.value * 0.0000254)
}

fun UnitDistance<*>.toMils() = toUnit(Mils(1.0))