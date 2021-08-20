package com.measures.imperial.volume.dry

import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class USDryBushel(override val value: Double) : UnitVolume<USDryBushel> {
    override fun asType(d: Double) = USDryBushel(d)
    override fun asBaseUnit() = Liter(value * 0.03523907 * 1000)
}

fun UnitVolume<*>.toUSDryBushel() = toUnit(USDryBushel(1.0))