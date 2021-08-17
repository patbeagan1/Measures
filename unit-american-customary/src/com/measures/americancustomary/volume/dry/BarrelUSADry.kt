package com.measures.americancustomary.volume.dry

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class BarrelUSADry(override val value: Double) : UnitVolume<BarrelUSADry> {
    override fun asType(d: Double) = BarrelUSADry(d)
    override fun toLiters() = Liters(value * 0.115628199 * 1000)
}

fun Liters.asBarrelUSADry() = toUnit(BarrelUSADry(1.0))
fun UnitVolume<*>.toBarrelUSADry() = toLiters().asBarrelUSADry()