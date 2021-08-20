package com.measures.other

@JvmInline
value class Capefeet(override val value: Double) : com.measures.distance.UnitDistance<Capefeet> {
    override fun asType(d: Double) = Capefeet(d)
    override fun asBaseUnit() = com.measures.distance.Meter(this.value * 0.314856)
}

fun com.measures.distance.UnitDistance<*>.toCapefeet() = toUnit(Capefeet(1.0))