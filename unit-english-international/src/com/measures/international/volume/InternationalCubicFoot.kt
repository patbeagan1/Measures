package com.measures.international.volume

import com.measures.volume.UnitVolume

@JvmInline
value class InternationalCubicFoot(override val value: Double) : UnitVolume<InternationalCubicFoot> {
    override fun asType(d: Double) = InternationalCubicFoot(d)
    override fun toLiters() = InternationalCubicInch(value * 1728).toLiters()
}

fun UnitVolume<*>.toInternationalCubicFoot() = toLiters().toUnit(InternationalCubicFoot(1.0))