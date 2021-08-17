package com.measures.volume

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class TeaspoonImperial(override val value: Double) : UnitVolume<TeaspoonImperial> {
    override fun asType(d: Double) = TeaspoonImperial(d)
    override fun toLiters() = Liters(value * 5.91939E-06 * 1000)
}

fun Liters.asTeaspoonImperial() = toUnit(TeaspoonImperial(1.0))
fun UnitVolume<*>.toTeaspoonImperial() = toLiters().asTeaspoonImperial()