package com.measures.imperial.volume.dry

import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class USDryGallon(override val value: Double) : UnitVolume<USDryGallon> {
    override fun asType(d: Double) = USDryGallon(d)
    override fun asBaseUnit() = Liter(value * 0.004404884 * 1000)
}

fun UnitVolume<*>.toUSDryGallon() = toUnit(USDryGallon(1.0))