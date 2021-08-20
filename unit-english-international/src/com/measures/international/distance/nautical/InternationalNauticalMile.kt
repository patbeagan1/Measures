package com.measures.international.distance.nautical

import com.measures.imperial.distance.UnitDistance

@JvmInline
value class InternationalNauticalMile(override val value: Double) : UnitDistance<InternationalNauticalMile> {
    override fun asType(d: Double) = InternationalNauticalMile(d);
    override fun asBaseUnit() = InternationalCable(value * 8.439).asBaseUnit()
}

fun UnitDistance<*>.toInternationalNauticalMile() = toUnit(InternationalNauticalMile(1.0))
