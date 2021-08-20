package com.measures.volume.dry

import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class USDryBushel(override val value: Double) : UnitVolume<USDryBushel> {
    override fun asType(d: Double) = USDryBushel(d)
    override fun toLiters() = Liter(value * 0.03523907 * 1000)
}

fun UnitVolume<*>.toUSDryBushel() = toLiters().toUnit(USDryBushel(1.0))