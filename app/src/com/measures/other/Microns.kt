package com.measures.other

@JvmInline
value class Microns(override val value: Double) : com.measures.distance.UnitDistance<Microns> {
    override fun asType(d: Double) = Microns(d)
    override fun asBaseUnit() = com.measures.distance.Meter(this.value * 0.000001)
}

fun com.measures.distance.UnitDistance<*>.toMicrons() = toUnit(Microns(1.0))