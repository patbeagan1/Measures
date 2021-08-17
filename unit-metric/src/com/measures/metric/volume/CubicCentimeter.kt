package com.measures.metric.volume

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class CubicCentimeter(override val value: Double) : UnitVolume<CubicCentimeter> {
    override fun asType(d: Double) = CubicCentimeter(d)
    override fun toLiters() = Liters(value * 0.000001 * 1000)
}

fun Liters.asCubicCentimeter() = toUnit(CubicCentimeter(1.0))
fun UnitVolume<*>.toCubicCentimeter() = toLiters().asCubicCentimeter()