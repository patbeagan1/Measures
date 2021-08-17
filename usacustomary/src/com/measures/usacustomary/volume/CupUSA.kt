package com.measures.usacustomary.volume

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class CupUSA(override val value: Double) : UnitVolume<CupUSA> {
    override fun asType(d: Double) = CupUSA(d)
    override fun toLiters() = Liters(value * 0.000236588 * 1000)
}

fun Liters.asCupUSA() = toUnit(CupUSA(1.0))
fun UnitVolume<*>.toCupUSA() = toLiters().asCupUSA()