package com.measures.metric.volume

import com.measures.Consts
import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class Attoliter(override val value: Double) : UnitVolume<Attoliter> {
    override fun asType(d: Double) = Attoliter(d);
    override fun asBaseUnit() = Liter(value * Consts.ATTO)
}

fun UnitVolume<*>.toAttoliter() = toUnit(Attoliter(1.0))