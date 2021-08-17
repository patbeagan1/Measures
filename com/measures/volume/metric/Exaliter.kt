package com.measures.volume.metric

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Exaliter(override val value: Double) : UnitVolume<Exaliter> {
    override fun asType(d: Double) = Exaliter(d);
    override fun toLiters() = Liters(value * Consts.EXA)
}