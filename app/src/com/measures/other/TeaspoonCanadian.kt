package com.measures.other

import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class TeaspoonCanadian(override val value: Double) : UnitVolume<TeaspoonCanadian> {
    override fun asType(d: Double) = TeaspoonCanadian(d)
    override fun toLiters() = Liter(value * 4.73551E-06 * 1000)
}

fun UnitVolume<*>.toTeaspoonCanadian() = toLiters().toUnit(TeaspoonCanadian(1.0))