package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class Nanoliter(override val value: Double) : UnitVolume<Nanoliter> {
    override fun asType(d: Double) = Nanoliter(d);
    override fun toLiters() = Liter(value * Consts.NANO)
}

fun UnitVolume<*>.toNanoliter() = toLiters().toUnit(Nanoliter(1.0))