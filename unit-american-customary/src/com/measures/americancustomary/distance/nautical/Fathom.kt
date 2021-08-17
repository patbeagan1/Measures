package com.measures.americancustomary.distance.nautical

import com.measures.distance.Meters
import com.measures.distance.UnitDistance
import com.measures.americancustomary.distance.Yard

@JvmInline
value class Fathom(override val value: Double) : UnitDistance<Fathom> {
    override fun asType(d: Double) = Fathom(d);
    override fun toMeters() = (Yard(2.0) * value).toMeters()
}

fun Meters.asFathom() = toUnit(Fathom(1.0))
fun UnitDistance<*>.toFathom() = toMeters().asFathom()
