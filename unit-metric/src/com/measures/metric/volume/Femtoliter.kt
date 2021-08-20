package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class Femtoliter(override val value: Double) : UnitVolume<Femtoliter> {
    override fun asType(d: Double) = Femtoliter(d);
    override fun toLiters() = Liter(value * Consts.FEMTO)
}

fun UnitVolume<*>.toFemtoliter() = toLiters().toUnit(Femtoliter(1.0))