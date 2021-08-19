package com.measures.volume

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Acrefoot(override val value: Double) : UnitVolume<Acrefoot> {
    override fun asType(d: Double) = Acrefoot(d)
    override fun toLiters() = Liters(value * 1233.481838 * 1000)
}

fun Liters.asAcrefoot() = toUnit(Acrefoot(1.0))
fun UnitVolume<*>.toAcrefoot() = toLiters().asAcrefoot()