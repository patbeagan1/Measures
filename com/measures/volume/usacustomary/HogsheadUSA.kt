package com.measures.volume.usacustomary

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class HogsheadUSA(override val value: Double) : UnitVolume<HogsheadUSA> {
    override fun asType(d: Double) = HogsheadUSA(d)
    override fun toLiters() = Liters(value * 0.238480942 * 1000)
}