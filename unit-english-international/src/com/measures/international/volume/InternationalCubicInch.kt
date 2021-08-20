package com.measures.international.volume

import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class InternationalCubicInch(override val value: Double) : UnitVolume<InternationalCubicInch> {
    override fun asType(d: Double) = InternationalCubicInch(d)
    override fun asBaseUnit() = Liter(value * 1.63871E-05 * 1000)
}

fun UnitVolume<*>.toInternationalCubicInch() = toUnit(InternationalCubicInch(1.0))