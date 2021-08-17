package com.measures.volume

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class PeckImperial(override val value: Double) : UnitVolume<PeckImperial> {
    override fun asType(d: Double) = PeckImperial(d)
    override fun toLiters() = Liters(value * 0.00909218 * 1000)
}

fun Liters.asPeckImperial() = toUnit(PeckImperial(1.0))
fun UnitVolume<*>.toPeckImperial() = toLiters().asPeckImperial()