package com.measures.international.distance

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class InternationalYard(override val value: Double) : UnitDistance<InternationalYard> {
    override fun asType(d: Double) = InternationalYard(d);
    override fun toMeters() = Meters(0.9144 * value)
}

fun UnitDistance<*>.toInternationalYard() = toMeters().toUnit(InternationalYard(1.0))
