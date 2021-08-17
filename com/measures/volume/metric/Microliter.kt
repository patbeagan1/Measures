package com.measures.volume.metric

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Microliter(override val value: Double) : UnitVolume<Microliter> {
    override fun asType(d: Double) = Microliter(d);
    override fun toLiters() = Liters(value * Consts.MICRO)
}