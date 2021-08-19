package com.measures.englishinternational.volume.dry

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class CubicFoot(override val value: Double) : UnitVolume<CubicFoot> {
    override fun asType(d: Double) = CubicFoot(d)
    override fun toLiters() = CubicInch(value * 1728).toLiters()
}

fun Liters.asCubicFoot() = toUnit(CubicFoot(1.0))
fun UnitVolume<*>.toCubicFoot() = toLiters().asCubicFoot()