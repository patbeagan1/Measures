package com.measures.volume

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class PintImperial(override val value: Double) : UnitVolume<PintImperial> {
    override fun asType(d: Double) = PintImperial(d)
    override fun toLiters() = Liters(value * 0.000568261 * 1000)
}

fun Liters.asPintImperial() = toUnit(PintImperial(1.0))
fun UnitVolume<*>.toPintImperial() = toLiters().asPintImperial()