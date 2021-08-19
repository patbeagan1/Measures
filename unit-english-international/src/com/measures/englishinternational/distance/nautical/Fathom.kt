package com.measures.englishinternational.distance.nautical

import com.measures.distance.Meters
import com.measures.distance.UnitDistance
import com.measures.englishinternational.distance.Yard

@JvmInline
value class Fathom(override val value: Double) : UnitDistance<Fathom> {
    override fun asType(d: Double) = Fathom(d);
    override fun toMeters() = Yard(value * 2.0).toMeters()
}

fun Meters.asFathom() = toUnit(Fathom(1.0))
fun UnitDistance<*>.toFathom() = toMeters().asFathom()
