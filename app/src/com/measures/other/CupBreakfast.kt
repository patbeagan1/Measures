package com.measures.other

import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class CupBreakfast(override val value: Double) : UnitVolume<CupBreakfast> {
    override fun asType(d: Double) = CupBreakfast(d)
    override fun toLiters() = Liter(value * 0.000284131 * 1000)
}

fun UnitVolume<*>.toCupBreakfast() = toLiters().toUnit(CupBreakfast(1.0))