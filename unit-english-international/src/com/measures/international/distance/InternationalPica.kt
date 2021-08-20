package com.measures.international.distance

import com.measures.distance.UnitDistance

@JvmInline
value class InternationalPica(override val value: Double) : UnitDistance<InternationalPica> {
    override fun asType(d: Double) = InternationalPica(d);
    override fun toMeters() = InternationalInch(value / 6.0).toMeters()
}

fun UnitDistance<*>.toInternationalPica() = toMeters().toUnit(InternationalPica(1.0))
