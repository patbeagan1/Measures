package com.measures.imperial.volume.dry

import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class USDryBarrel(override val value: Double) : UnitVolume<USDryBarrel> {
    override fun asType(d: Double) = USDryBarrel(d)
    override fun asBaseUnit() = Liter(value * 0.115628199 * 1000)
}

fun UnitVolume<*>.toUSDryBarrel() = toUnit(USDryBarrel(1.0))