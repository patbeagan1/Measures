package com.measures.international.distance.nautical

import com.measures.distance.UnitDistance
import com.measures.international.distance.InternationalYard

@JvmInline
value class InternationalFathom(override val value: Double) : UnitDistance<InternationalFathom> {
    override fun asType(d: Double) = InternationalFathom(d);
    override fun toMeters() = InternationalYard(value * 2.0).toMeters()
}

fun UnitDistance<*>.toInternationalFathom() = toMeters().toUnit(InternationalFathom(1.0))
