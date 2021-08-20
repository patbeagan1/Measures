package com.measures.international.volume

import com.measures.volume.UnitVolume

@JvmInline
value class InternationalCubicYard(override val value: Double) : UnitVolume<InternationalCubicYard> {
    override fun asType(d: Double) = InternationalCubicYard(d)
    override fun toLiters() = InternationalCubicFoot(value * 27).toLiters()
}

fun UnitVolume<*>.toInternationalCubicYard() = toLiters().toUnit(InternationalCubicYard(1.0))