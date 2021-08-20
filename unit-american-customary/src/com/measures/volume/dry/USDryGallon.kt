package com.measures.volume.dry

import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class USDryGallon(override val value: Double) : UnitVolume<USDryGallon> {
    override fun asType(d: Double) = USDryGallon(d)
    override fun toLiters() = Liter(value * 0.004404884 * 1000)
}

fun UnitVolume<*>.toUSDryGallon() = toLiters().toUnit(USDryGallon(1.0))