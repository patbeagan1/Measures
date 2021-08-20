package com.measures.other

@JvmInline
value class Angstroms(override val value: Double) : com.measures.distance.UnitDistance<Angstroms> {
    override fun asType(d: Double) = Angstroms(d)
    override fun asBaseUnit() = com.measures.distance.Meter(this.value * 1E-10)
}

fun com.measures.distance.Meter.asAngstroms() = toUnit(Angstroms(1.0))
fun com.measures.distance.UnitDistance<*>.toAngstroms() = asBaseUnit().asAngstroms()