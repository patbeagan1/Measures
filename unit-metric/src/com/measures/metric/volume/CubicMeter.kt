package com.measures.metric.volume

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class CubicMeter(override val value: Double) : UnitVolume<CubicMeter> {
    override fun asType(d: Double) = CubicMeter(d)
    override fun toLiters() = Liters(value * 1 * 1000)
}

fun Liters.asCubicMeter() = toUnit(CubicMeter(1.0))
fun UnitVolume<*>.toCubicMeter() = toLiters().asCubicMeter()