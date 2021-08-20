package com.measures.volume.dry

import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class USDryPeck(override val value: Double) : UnitVolume<USDryPeck> {
    override fun asType(d: Double) = USDryPeck(d)
    override fun toLiters() = Liter(value * 0.008809768 * 1000)
}

fun UnitVolume<*>.toUSDryPeck() = toLiters().toUnit(USDryPeck(1.0))