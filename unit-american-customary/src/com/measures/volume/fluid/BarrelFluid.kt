package com.measures.volume.fluid

import com.measures.volume.UnitVolume

@JvmInline
value class BarrelFluid(override val value: Double) : UnitVolume<BarrelFluid> {
    override fun asType(d: Double) = BarrelFluid(d);
    override fun toLiters() = USFluidGallon(value * 31.5).toLiters()
}