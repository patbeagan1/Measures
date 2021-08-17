package com.measures.volume.canadian

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class CupCanadian(override val value: Double) : UnitVolume<CupCanadian> {
    override fun asType(d: Double) = CupCanadian(d)
    override fun toLiters() = Liters(value * 0.000227305 * 1000)
}