package com.measures.englishinternational.volume.dry

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class CubicInch(override val value: Double) : UnitVolume<CubicInch> {
    override fun asType(d: Double) = CubicInch(d)
    override fun toLiters() = Liters(value * 1.63871E-05 * 1000)
}

fun Liters.asCubicInch() = toUnit(CubicInch(1.0))
fun UnitVolume<*>.toCubicInch() = toLiters().asCubicInch()