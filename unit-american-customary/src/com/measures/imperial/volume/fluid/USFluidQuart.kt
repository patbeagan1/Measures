package com.measures.imperial.volume.fluid

import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class USFluidQuart(override val value: Double) : UnitVolume<USFluidQuart> {
    override fun asType(d: Double) = USFluidQuart(d);
    override fun asBaseUnit() = Liter(value * 0.946352946)
}

fun UnitVolume<*>.toUSFluidQuart() = toUnit(USFluidQuart(1.0))
