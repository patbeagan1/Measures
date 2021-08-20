package com.measures.other

@JvmInline
value class Mils(override val value: Double) : com.measures.distance.UnitDistance<Mils> {
    override fun asType(d: Double) = Mils(d)
    override fun asBaseUnit() = com.measures.distance.Meter(this.value * 0.0000254)
}

fun com.measures.distance.UnitDistance<*>.toMils() = toUnit(Mils(1.0))