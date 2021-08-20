package com.measures.metric.volume

import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class CubicCentimeter(override val value: Double) : UnitVolume<CubicCentimeter> {
    override fun asType(d: Double) = CubicCentimeter(d)
    override fun asBaseUnit() = Liter(value * 0.000001 * 1000)
}

fun UnitVolume<*>.toCubicCentimeter() = toUnit(CubicCentimeter(1.0))