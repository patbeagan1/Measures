package com.measures.metric.volume

import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class CubicMeter(override val value: Double) : UnitVolume<CubicMeter> {
    override fun asType(d: Double) = CubicMeter(d)
    override fun toLiters() = Liter(value * 1 * 1000)
}

fun UnitVolume<*>.toCubicMeter() = toLiters().toUnit(CubicMeter(1.0))