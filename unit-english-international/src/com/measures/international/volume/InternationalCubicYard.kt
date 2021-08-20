package com.measures.international.volume

import com.measures.imperial.volume.UnitVolume

@JvmInline
value class InternationalCubicYard(override val value: Double) : UnitVolume<InternationalCubicYard> {
    override fun asType(d: Double) = InternationalCubicYard(d)
    override fun asBaseUnit() = InternationalCubicFoot(value * 27).asBaseUnit()
}

fun UnitVolume<*>.toInternationalCubicYard() = toUnit(InternationalCubicYard(1.0))