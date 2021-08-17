package com.measures

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Angstroms(override val value: Double) : UnitDistance<Angstroms> {
    override fun asType(d: Double) = Angstroms(d)
    override fun toMeters() = Meters(this.value * 1E-10)
}

fun Meters.asAngstroms() = toUnit(Angstroms(1.0))
fun UnitDistance<*>.toAngstroms() = toMeters().asAngstroms()