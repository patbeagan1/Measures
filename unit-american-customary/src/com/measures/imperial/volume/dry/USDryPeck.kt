package com.measures.imperial.volume.dry

import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class USDryPeck(override val value: Double) : UnitVolume<USDryPeck> {
    override fun asType(d: Double) = USDryPeck(d)
    override fun asBaseUnit() = Liter(value * 0.008809768 * 1000)
}

fun UnitVolume<*>.toUSDryPeck() = toUnit(USDryPeck(1.0))