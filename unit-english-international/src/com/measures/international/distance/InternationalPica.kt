package com.measures.international.distance

import com.measures.imperial.distance.UnitDistance

@JvmInline
value class InternationalPica(override val value: Double) : UnitDistance<InternationalPica> {
    override fun asType(d: Double) = InternationalPica(d);
    override fun asBaseUnit() = InternationalInch(value / 6.0).asBaseUnit()
}

fun UnitDistance<*>.toInternationalPica() = toUnit(InternationalPica(1.0))
