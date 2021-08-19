package com.measures.volume

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class CupBreakfast(override val value: Double) : UnitVolume<CupBreakfast> {
    override fun asType(d: Double) = CupBreakfast(d)
    override fun toLiters() = Liters(value * 0.000284131 * 1000)
}

fun Liters.asCupBreakfast() = toUnit(CupBreakfast(1.0))
fun UnitVolume<*>.toCupBreakfast() = toLiters().asCupBreakfast()