package com.measures.americancustomary.volume.dry

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class PeckUSADry(override val value: Double) : UnitVolume<PeckUSADry> {
    override fun asType(d: Double) = PeckUSADry(d)
    override fun toLiters() = Liters(value * 0.008809768 * 1000)
}

fun Liters.asPeckUSADry() = toUnit(PeckUSADry(1.0))
fun UnitVolume<*>.toPeckUSADry() = toLiters().asPeckUSADry()