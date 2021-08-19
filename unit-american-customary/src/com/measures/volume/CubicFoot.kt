package com.measures.volume

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class CubicFoot(override val value: Double) : UnitVolume<CubicFoot> {
    override fun asType(d: Double) = CubicFoot(d)
    override fun toLiters() = Liters(value * 0.028316847 * 1000)
}

fun Liters.asCubicFoot() = toUnit(CubicFoot(1.0))
fun UnitVolume<*>.toCubicFoot() = toLiters().asCubicFoot()