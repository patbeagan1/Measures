package com.measures.volume.metric

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Attoliter(override val value: Double) : UnitVolume<Attoliter> {
    override fun asType(d: Double) = Attoliter(d);
    override fun toLiters() = Liters(value * Consts.ATTO)
}