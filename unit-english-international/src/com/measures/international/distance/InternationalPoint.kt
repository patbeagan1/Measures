package com.measures.international.distance

import com.measures.distance.UnitDistance

@JvmInline
value class InternationalPoint(override val value: Double) : UnitDistance<InternationalPoint> {
    override fun asType(d: Double) = InternationalPoint(d);
    override fun toMeters() = InternationalPica(value / 12.0).toMeters()
}

fun UnitDistance<*>.toInternationalPoint() = toMeters().toUnit(InternationalPoint(1.0))
