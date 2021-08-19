package com.measures.volume.fluid

import com.measures.volume.UnitVolume

@JvmInline
value class BarrelOil(override val value: Double) : UnitVolume<BarrelOil> {
    override fun asType(d: Double) = BarrelOil(d);
    override fun toLiters() = USFluidGallon(value * 42.0).toLiters()
}