package com.measures.volume.metric

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Teraliter(override val value: Double) : UnitVolume<Teraliter> {
    override fun asType(d: Double) = Teraliter(d);
    override fun toLiters() = Liters(value * Consts.TERA)
}