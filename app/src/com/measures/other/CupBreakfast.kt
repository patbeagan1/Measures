package com.measures.other

import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class CupBreakfast(override val value: Double) : UnitVolume<CupBreakfast> {
    override fun asType(d: Double) = CupBreakfast(d)
    override fun asBaseUnit() = Liter(value * 0.000284131 * 1000)
}

fun UnitVolume<*>.toCupBreakfast() = toUnit(CupBreakfast(1.0))