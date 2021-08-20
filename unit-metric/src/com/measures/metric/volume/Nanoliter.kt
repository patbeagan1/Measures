package com.measures.metric.volume

import com.measures.Consts
import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class Nanoliter(override val value: Double) : UnitVolume<Nanoliter> {
    override fun asType(d: Double) = Nanoliter(d);
    override fun asBaseUnit() = Liter(value * Consts.NANO)
}

fun UnitVolume<*>.toNanoliter() = toUnit(Nanoliter(1.0))