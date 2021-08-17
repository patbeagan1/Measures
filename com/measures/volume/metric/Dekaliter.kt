package com.measures.volume.metric

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Dekaliter(override val value: Double) : UnitVolume<Dekaliter> {
    override fun asType(d: Double) = Dekaliter(d);
    override fun toLiters() = Liters(value * Consts.DEKA)
}