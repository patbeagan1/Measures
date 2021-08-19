package com.measures.volume

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class CubicMile(override val value: Double) : UnitVolume<CubicMile> {
    override fun asType(d: Double) = CubicMile(d)
    override fun toLiters() = Liters(value * 4168181825 * 1000)
}

fun Liters.asCubicMile() = toUnit(CubicMile(1.0))
fun UnitVolume<*>.toCubicMile() = toLiters().asCubicMile()