package com.measures.volume.fluid

import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class USFluidQuart(override val value: Double) : UnitVolume<USFluidQuart> {
    override fun asType(d: Double) = USFluidQuart(d);
    override fun toLiters() = Liter(value * 0.946352946)
}

fun UnitVolume<*>.toUSFluidQuart() = toLiters().toUnit(USFluidQuart(1.0))
