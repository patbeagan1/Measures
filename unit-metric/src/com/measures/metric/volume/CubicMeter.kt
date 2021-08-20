package com.measures.metric.volume

import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class CubicMeter(override val value: Double) : UnitVolume<CubicMeter> {
    override fun asType(d: Double) = CubicMeter(d)
    override fun asBaseUnit() = Liter(value * 1 * 1000)
}

fun UnitVolume<*>.toCubicMeter() = toUnit(CubicMeter(1.0))