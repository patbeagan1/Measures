package com.measures.volume.dry

import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class USDryQuart(override val value: Double) : UnitVolume<USDryQuart> {
    override fun asType(d: Double) = USDryQuart(d)
    override fun toLiters() = Liter(value * 0.001101221 * 1000)
}

fun UnitVolume<*>.toUSDryQuart() = toLiters().toUnit(USDryQuart(1.0))