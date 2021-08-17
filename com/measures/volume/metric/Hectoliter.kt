package com.measures.volume.metric

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Hectoliter(override val value: Double) : UnitVolume<Hectoliter> {
    override fun asType(d: Double) = Hectoliter(d);
    override fun toLiters() = Liters(value * Consts.HECTO)
}