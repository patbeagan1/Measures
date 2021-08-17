package com.measures.usacustomary.volume.dry

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class QuartUSADry(override val value: Double) : UnitVolume<QuartUSADry> {
    override fun asType(d: Double) = QuartUSADry(d)
    override fun toLiters() = Liters(value * 0.001101221 * 1000)
}

fun Liters.asQuartUSADry() = toUnit(QuartUSADry(1.0))
fun UnitVolume<*>.toQuartUSADry() = toLiters().asQuartUSADry()