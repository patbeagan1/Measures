package com.measures.volume.fluid

import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class USFluidDram(override val value: Double) : UnitVolume<USFluidDram> {
    override fun asType(d: Double) = USFluidDram(d);
    override fun toLiters() = USTeaspoon(value * 0.75).toLiters()
}

fun Liter.asUSFluidDram() = toUnit(USFluidDram(1.0))
fun UnitVolume<*>.toUSFluidDram() = toLiters().asUSFluidDram()
