package com.measures.imperial.volume.fluid

import com.measures.imperial.volume.UnitVolume

@JvmInline
value class USFluidBarrel(override val value: Double) : UnitVolume<USFluidBarrel> {
    override fun asType(d: Double) = USFluidBarrel(d);
    override fun asBaseUnit() = USFluidGallon(value * 31.5).asBaseUnit()
}

fun UnitVolume<*>.toUSFluidBarrel() = toUnit(USFluidBarrel(1.0))
