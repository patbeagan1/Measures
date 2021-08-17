package com.measures.americancustomary.volume.fluid

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class PintUSAFluid(override val value: Double) : UnitVolume<PintUSAFluid> {
    override fun asType(d: Double) = PintUSAFluid(d)
    override fun toLiters() = Liters(value * 0.000473176 * 1000)
}

fun Liters.asPintUSAFluid() = toUnit(PintUSAFluid(1.0))
fun UnitVolume<*>.toPintUSAFluid() = toLiters().asPintUSAFluid()