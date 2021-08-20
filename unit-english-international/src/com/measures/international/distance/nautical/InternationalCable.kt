package com.measures.international.distance.nautical

import com.measures.distance.UnitDistance

@JvmInline
value class InternationalCable(override val value: Double) : UnitDistance<InternationalCable> {
    override fun asType(d: Double) = InternationalCable(d);
    override fun toMeters() = InternationalFathom(value * 120.0).toMeters()
}

fun UnitDistance<*>.toInternationalCable() = toMeters().toUnit(InternationalCable(1.0))
