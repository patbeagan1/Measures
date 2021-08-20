package com.measures.other

import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class TeaspoonCanadian(override val value: Double) : UnitVolume<TeaspoonCanadian> {
    override fun asType(d: Double) = TeaspoonCanadian(d)
    override fun asBaseUnit() = Liter(value * 4.73551E-06 * 1000)
}

fun UnitVolume<*>.toTeaspoonCanadian() = toUnit(TeaspoonCanadian(1.0))