package com.measures.imperial.volume.dry

import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class USDryQuart(override val value: Double) : UnitVolume<USDryQuart> {
    override fun asType(d: Double) = USDryQuart(d)
    override fun asBaseUnit() = Liter(value * 0.001101221 * 1000)
}

fun UnitVolume<*>.toUSDryQuart() = toUnit(USDryQuart(1.0))