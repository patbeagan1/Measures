package com.measures.volume.dry

import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class USDryBarrel(override val value: Double) : UnitVolume<USDryBarrel> {
    override fun asType(d: Double) = USDryBarrel(d)
    override fun toLiters() = Liter(value * 0.115628199 * 1000)
}

fun UnitVolume<*>.toUSDryBarrel() = toLiters().toUnit(USDryBarrel(1.0))