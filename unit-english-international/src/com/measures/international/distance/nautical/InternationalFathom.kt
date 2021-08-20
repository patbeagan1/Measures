package com.measures.international.distance.nautical

import com.measures.imperial.distance.UnitDistance
import com.measures.international.distance.InternationalYard

@JvmInline
value class InternationalFathom(override val value: Double) : UnitDistance<InternationalFathom> {
    override fun asType(d: Double) = InternationalFathom(d);
    override fun asBaseUnit() = InternationalYard(value * 2.0).asBaseUnit()
}

fun UnitDistance<*>.toInternationalFathom() = toUnit(InternationalFathom(1.0))
