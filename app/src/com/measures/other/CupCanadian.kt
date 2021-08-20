package com.measures.other

import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class CupCanadian(override val value: Double) : UnitVolume<CupCanadian> {
    override fun asType(d: Double) = CupCanadian(d)
    override fun toLiters() = Liter(value * 0.000227305 * 1000)
}

fun UnitVolume<*>.toCupCanadian() = toLiters().toUnit(CupCanadian(1.0))