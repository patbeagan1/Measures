package com.measures.other

import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Capefeet(override val value: Double) : UnitDistance<Capefeet> {
    override fun asType(d: Double) = Capefeet(d)
    override fun asBaseUnit() = Meters(this.value * 0.314856)
}

fun UnitDistance<*>.toCapefeet() = toUnit(Capefeet(1.0))