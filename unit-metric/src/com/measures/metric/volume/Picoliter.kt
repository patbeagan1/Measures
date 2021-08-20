package com.measures.metric.volume

import com.measures.Consts
import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class Picoliter(override val value: Double) : UnitVolume<Picoliter> {
    override fun asType(d: Double) = Picoliter(d);
    override fun asBaseUnit() = Liter(value * Consts.PICO)
}

fun UnitVolume<*>.toPicoliter() = toUnit(Picoliter(1.0))