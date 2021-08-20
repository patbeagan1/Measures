package com.measures.volume.fluid

import com.measures.volume.UnitVolume

@JvmInline
value class USFluidBarrel(override val value: Double) : UnitVolume<USFluidBarrel> {
    override fun asType(d: Double) = USFluidBarrel(d);
    override fun toLiters() = USFluidGallon(value * 31.5).toLiters()
}

fun UnitVolume<*>.toUSFluidBarrel() = toLiters().toUnit(USFluidBarrel(1.0))
