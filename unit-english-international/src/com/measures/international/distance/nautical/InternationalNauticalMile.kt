package com.measures.international.distance.nautical

import com.measures.distance.UnitDistance

@JvmInline
value class InternationalNauticalMile(override val value: Double) : UnitDistance<InternationalNauticalMile> {
    override fun asType(d: Double) = InternationalNauticalMile(d);
    override fun toMeters() = InternationalCable(value * 8.439).toMeters()
}

fun UnitDistance<*>.toInternationalNauticalMile() = toMeters().toUnit(InternationalNauticalMile(1.0))
