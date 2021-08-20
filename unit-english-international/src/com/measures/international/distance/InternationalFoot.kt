package com.measures.international.distance

import com.measures.imperial.distance.UnitDistance

@JvmInline
value class InternationalFoot(override val value: Double) : UnitDistance<InternationalFoot> {
    override fun asType(d: Double) = InternationalFoot(d);
    override fun asBaseUnit() = InternationalYard(value / 3.0).asBaseUnit()
}

fun UnitDistance<*>.toInternationalFoot() = toUnit(InternationalFoot(1.0))
