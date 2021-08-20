package com.measures.international.distance

import com.measures.distance.UnitDistance

@JvmInline
value class InternationalFoot(override val value: Double) : UnitDistance<InternationalFoot> {
    override fun asType(d: Double) = InternationalFoot(d);
    override fun toMeters() = InternationalYard(value / 3.0).toMeters()
}

fun UnitDistance<*>.toInternationalFoot() = toMeters().toUnit(InternationalFoot(1.0))
