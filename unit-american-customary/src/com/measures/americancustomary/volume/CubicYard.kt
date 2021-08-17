package com.measures.americancustomary.volume

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class CubicYard(override val value: Double) : UnitVolume<CubicYard> {
    override fun asType(d: Double) = CubicYard(d)
    override fun toLiters() = Liters(value * 0.764554858 * 1000)
}

fun Liters.asCubicYard() = toUnit(CubicYard(1.0))
fun UnitVolume<*>.toCubicYard() = toLiters().asCubicYard()