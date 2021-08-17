package com.measures.volume

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class BushelImperial(override val value: Double) : UnitVolume<BushelImperial> {
    override fun asType(d: Double) = BushelImperial(d)
    override fun toLiters() = Liters(value * 0.03636872 * 1000)
}

fun Liters.asBushelImperial() = toUnit(BushelImperial(1.0))
fun UnitVolume<*>.toBushelImperial() = toLiters().asBushelImperial()