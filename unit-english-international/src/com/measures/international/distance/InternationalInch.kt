package com.measures.international.distance

import com.measures.imperial.distance.UnitDistance

@JvmInline
value class InternationalInch(override val value: Double) : UnitDistance<InternationalInch> {
    override fun asType(d: Double) = InternationalInch(d);
    override fun asBaseUnit() = InternationalFoot(value / 12.0).asBaseUnit()
}

fun UnitDistance<*>.toInternationalInch() = toUnit(InternationalInch(1.0))
