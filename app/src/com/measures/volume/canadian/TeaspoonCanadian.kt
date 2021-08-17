package com.measures.volume.canadian

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class TeaspoonCanadian(override val value: Double) : UnitVolume<TeaspoonCanadian> {
    override fun asType(d: Double) = TeaspoonCanadian(d)
    override fun toLiters() = Liters(value * 4.73551E-06 * 1000)
}

fun Liters.asTeaspoonCanadian() = toUnit(TeaspoonCanadian(1.0))
fun UnitVolume<*>.toTeaspoonCanadian() = toLiters().asTeaspoonCanadian()