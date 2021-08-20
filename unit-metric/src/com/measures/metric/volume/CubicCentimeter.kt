package com.measures.metric.volume

import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class CubicCentimeter(override val value: Double) : UnitVolume<CubicCentimeter> {
    override fun asType(d: Double) = CubicCentimeter(d)
    override fun toLiters() = Liter(value * 0.000001 * 1000)
}

fun UnitVolume<*>.toCubicCentimeter() = toLiters().toUnit(CubicCentimeter(1.0))