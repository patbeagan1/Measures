package com.measures.volume.fluid

import com.measures.volume.UnitVolume

@JvmInline
value class USOilBarrel(override val value: Double) : UnitVolume<USOilBarrel> {
    override fun asType(d: Double) = USOilBarrel(d);
    override fun toLiters() = USFluidGallon(value * 42.0).toLiters()
}

fun UnitVolume<*>.toUSOilBarrel() = toLiters().toUnit(USOilBarrel(1.0))
