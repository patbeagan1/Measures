package com.measures.volume.dry

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class BushelUSADry(override val value: Double) : UnitVolume<BushelUSADry> {
    override fun asType(d: Double) = BushelUSADry(d)
    override fun toLiters() = Liters(value * 0.03523907 * 1000)
}

fun Liters.asBushelUSADry() = toUnit(BushelUSADry(1.0))
fun UnitVolume<*>.toBushelUSADry() = toLiters().asBushelUSADry()