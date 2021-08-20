package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class Attoliter(override val value: Double) : UnitVolume<Attoliter> {
    override fun asType(d: Double) = Attoliter(d);
    override fun toLiters() = Liter(value * Consts.ATTO)
}

fun UnitVolume<*>.toAttoliter() = toLiters().toUnit(Attoliter(1.0))