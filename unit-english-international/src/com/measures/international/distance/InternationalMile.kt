package com.measures.international.distance

import com.measures.distance.UnitDistance

@JvmInline
value class InternationalMile(override val value: Double) : UnitDistance<InternationalMile> {
    override fun asType(d: Double) = InternationalMile(d);
    override fun toMeters() = InternationalYard(value * 1760.0).toMeters()
}

fun UnitDistance<*>.toInternationalMile() = toMeters().toUnit(InternationalMile(1.0))
