package com.measures.imperial.volume.fluid

import com.measures.imperial.volume.UnitVolume

@JvmInline
value class USOilBarrel(override val value: Double) : UnitVolume<USOilBarrel> {
    override fun asType(d: Double) = USOilBarrel(d);
    override fun asBaseUnit() = USFluidGallon(value * 42.0).asBaseUnit()
}

fun UnitVolume<*>.toUSOilBarrel() = toUnit(USOilBarrel(1.0))
