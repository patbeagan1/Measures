package com.measures.international.distance

import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class InternationalYard(override val value: Double) : UnitDistance<InternationalYard> {
    override fun asType(d: Double) = InternationalYard(d);
    override fun asBaseUnit() = Meters(0.9144 * value)
}

fun UnitDistance<*>.toInternationalYard() = toUnit(InternationalYard(1.0))
