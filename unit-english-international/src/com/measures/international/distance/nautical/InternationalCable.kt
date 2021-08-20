package com.measures.international.distance.nautical

import com.measures.imperial.distance.UnitDistance

@JvmInline
value class InternationalCable(override val value: Double) : UnitDistance<InternationalCable> {
    override fun asType(d: Double) = InternationalCable(d);
    override fun asBaseUnit() = InternationalFathom(value * 120.0).asBaseUnit()
}

fun UnitDistance<*>.toInternationalCable() = toUnit(InternationalCable(1.0))
