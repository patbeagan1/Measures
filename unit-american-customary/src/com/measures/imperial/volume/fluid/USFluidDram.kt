package com.measures.imperial.volume.fluid

import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class USFluidDram(override val value: Double) : UnitVolume<USFluidDram> {
    override fun asType(d: Double) = USFluidDram(d);
    override fun asBaseUnit() = USTeaspoon(value * 0.75).asBaseUnit()
}

fun Liter.asUSFluidDram() = toUnit(USFluidDram(1.0))
fun UnitVolume<*>.toUSFluidDram() = asBaseUnit().asUSFluidDram()
