package com.measures.international.distance

import com.measures.distance.UnitDistance

@JvmInline
value class InternationalInch(override val value: Double) : UnitDistance<InternationalInch> {
    override fun asType(d: Double) = InternationalInch(d);
    override fun toMeters() = InternationalFoot(value / 12.0).toMeters()
}

fun UnitDistance<*>.toInternationalInch() = toMeters().toUnit(InternationalInch(1.0))
