package com.measures.other

import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Angstroms(override val value: Double) : UnitDistance<Angstroms> {
    override fun asType(d: Double) = Angstroms(d)
    override fun asBaseUnit() = Meters(this.value * 1E-10)
}

fun Meters.asAngstroms() = toUnit(Angstroms(1.0))
fun UnitDistance<*>.toAngstroms() = asBaseUnit().asAngstroms()