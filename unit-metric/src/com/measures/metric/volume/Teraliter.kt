package com.measures.metric.volume

import com.measures.Consts
import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class Teraliter(override val value: Double) : UnitVolume<Teraliter> {
    override fun asType(d: Double) = Teraliter(d);
    override fun asBaseUnit() = Liter(value * Consts.TERA)
}

fun UnitVolume<*>.toTeraliter() = toUnit(Teraliter(1.0))