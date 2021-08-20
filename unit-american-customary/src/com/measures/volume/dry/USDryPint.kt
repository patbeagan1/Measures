package com.measures.volume.dry

import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class USDryPint(override val value: Double) : UnitVolume<USDryPint> {
    override fun asType(d: Double) = USDryPint(d)
    override fun toLiters() = Liter(value * 0.00055061 * 1000)
}

fun UnitVolume<*>.toUSDryPint() = toUnit(USDryPint(1.0))