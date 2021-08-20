package com.measures.metric.volume

import com.measures.Consts
import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class Femtoliter(override val value: Double) : UnitVolume<Femtoliter> {
    override fun asType(d: Double) = Femtoliter(d);
    override fun asBaseUnit() = Liter(value * Consts.FEMTO)
}

fun UnitVolume<*>.toFemtoliter() = toUnit(Femtoliter(1.0))