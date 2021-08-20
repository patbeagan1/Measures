package com.measures.international.distance

import com.measures.imperial.distance.UnitDistance

@JvmInline
value class InternationalPoint(override val value: Double) : UnitDistance<InternationalPoint> {
    override fun asType(d: Double) = InternationalPoint(d);
    override fun asBaseUnit() = InternationalPica(value / 12.0).asBaseUnit()
}

fun UnitDistance<*>.toInternationalPoint() = toUnit(InternationalPoint(1.0))
