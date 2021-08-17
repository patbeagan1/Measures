package com.measures.volume

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class GillImperial(override val value: Double) : UnitVolume<GillImperial> {
    override fun asType(d: Double) = GillImperial(d)
    override fun toLiters() = Liters(value * 0.000142065 * 1000)
}

fun Liters.asGillImperial() = toUnit(GillImperial(1.0))
fun UnitVolume<*>.toGillImperial() = toLiters().asGillImperial()