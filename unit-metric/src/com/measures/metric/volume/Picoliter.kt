package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class Picoliter(override val value: Double) : UnitVolume<Picoliter> {
    override fun asType(d: Double) = Picoliter(d);
    override fun toLiters() = Liter(value * Consts.PICO)
}

fun UnitVolume<*>.toPicoliter() = toLiters().toUnit(Picoliter(1.0))