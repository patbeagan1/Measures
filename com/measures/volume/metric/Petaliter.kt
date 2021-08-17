package com.measures.volume.metric

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Petaliter(override val value: Double) : UnitVolume<Petaliter> {
    override fun asType(d: Double) = Petaliter(d);
    override fun toLiters() = Liters(value * Consts.PETA)
}