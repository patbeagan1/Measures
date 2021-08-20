package com.measures.other

import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class CupCanadian(override val value: Double) : UnitVolume<CupCanadian> {
    override fun asType(d: Double) = CupCanadian(d)
    override fun asBaseUnit() = Liter(value * 0.000227305 * 1000)
}

fun UnitVolume<*>.toCupCanadian() = toUnit(CupCanadian(1.0))