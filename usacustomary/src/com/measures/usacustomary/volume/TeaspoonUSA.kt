package com.measures.usacustomary.volume

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class TeaspoonUSA(override val value: Double) : UnitVolume<TeaspoonUSA> {
    override fun asType(d: Double) = TeaspoonUSA(d)
    override fun toLiters() = Liters(value * 4.92892E-06 * 1000)
}

fun Liters.asTeaspoonUSA() = toUnit(TeaspoonUSA(1.0))
fun UnitVolume<*>.toTeaspoonUSA() = toLiters().asTeaspoonUSA()