package com.measures.volume.dry

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class PintUSADry(override val value: Double) : UnitVolume<PintUSADry> {
    override fun asType(d: Double) = PintUSADry(d)
    override fun toLiters() = Liters(value * 0.00055061 * 1000)
}

fun Liters.asPintUSADry() = toUnit(PintUSADry(1.0))
fun UnitVolume<*>.toPintUSADry() = toLiters().asPintUSADry()