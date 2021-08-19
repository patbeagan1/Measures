package com.measures.volume

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class GillUSA(override val value: Double) : UnitVolume<GillUSA> {
    override fun asType(d: Double) = GillUSA(d)
    override fun toLiters() = Liters(value * 0.000118294 * 1000)
}

fun Liters.asGillUSA() = toUnit(GillUSA(1.0))
fun UnitVolume<*>.toGillUSA() = toLiters().asGillUSA()