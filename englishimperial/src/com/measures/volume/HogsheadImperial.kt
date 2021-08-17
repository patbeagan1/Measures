package com.measures.volume

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class HogsheadImperial(override val value: Double) : UnitVolume<HogsheadImperial> {
    override fun asType(d: Double) = HogsheadImperial(d)
    override fun toLiters() = Liters(value * 0.32731848 * 1000)
}

fun Liters.asHogsheadImperial() = toUnit(HogsheadImperial(1.0))
fun UnitVolume<*>.toHogsheadImperial() = toLiters().asHogsheadImperial()