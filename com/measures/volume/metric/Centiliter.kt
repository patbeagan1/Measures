package com.measures.volume.metric

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Centiliter(override val value: Double) : UnitVolume<Centiliter> {
    override fun asType(d: Double) = Centiliter(d);
    override fun toLiters() = Liters(value * Consts.CENTI)
}