package com.measures.international.volume

import com.measures.imperial.volume.UnitVolume

@JvmInline
value class InternationalCubicFoot(override val value: Double) : UnitVolume<InternationalCubicFoot> {
    override fun asType(d: Double) = InternationalCubicFoot(d)
    override fun asBaseUnit() = InternationalCubicInch(value * 1728).asBaseUnit()
}

fun UnitVolume<*>.toInternationalCubicFoot() = toUnit(InternationalCubicFoot(1.0))