package com.measures.international.volume

import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class InternationalCubicInch(override val value: Double) : UnitVolume<InternationalCubicInch> {
    override fun asType(d: Double) = InternationalCubicInch(d)
    override fun toLiters() = Liter(value * 1.63871E-05 * 1000)
}

fun UnitVolume<*>.toInternationalCubicInch() = toLiters().toUnit(InternationalCubicInch(1.0))