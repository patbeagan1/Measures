package com.measures.international.distance

import com.measures.imperial.distance.UnitDistance

@JvmInline
value class InternationalMile(override val value: Double) : UnitDistance<InternationalMile> {
    override fun asType(d: Double) = InternationalMile(d);
    override fun asBaseUnit() = InternationalYard(value * 1760.0).asBaseUnit()
}

fun UnitDistance<*>.toInternationalMile() = toUnit(InternationalMile(1.0))
