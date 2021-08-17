package com.measures.volume.metric

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Nanoliter(override val value: Double) : UnitVolume<Nanoliter> {
    override fun asType(d: Double) = Nanoliter(d);
    override fun toLiters() = Liters(value * Consts.NANO)
}