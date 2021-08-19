package com.measures.englishinternational.volume.dry

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class CubicYard(override val value: Double) : UnitVolume<CubicYard> {
    override fun asType(d: Double) = CubicYard(d)
    override fun toLiters() = CubicFoot(value * 27).toLiters()
}

fun Liters.asCubicYard() = toUnit(CubicYard(1.0))
fun UnitVolume<*>.toCubicYard() = toLiters().asCubicYard()