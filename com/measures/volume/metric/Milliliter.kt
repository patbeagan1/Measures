package com.measures.volume.metric

import com.measures.Consts.MILLI
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Milliliter(override val value: Double) : UnitVolume<Milliliter> {
    override fun asType(d: Double) = Milliliter(d);
    override fun toLiters() = Liters(value * MILLI)
}