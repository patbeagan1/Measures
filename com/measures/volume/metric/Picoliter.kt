package com.measures.volume.metric

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Picoliter(override val value: Double) : UnitVolume<Picoliter> {
    override fun asType(d: Double) = Picoliter(d);
    override fun toLiters() = Liters(value * Consts.PICO)
}