package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class Teraliter(override val value: Double) : UnitVolume<Teraliter> {
    override fun asType(d: Double) = Teraliter(d);
    override fun toLiters() = Liter(value * Consts.TERA)
}

fun UnitVolume<*>.toTeraliter() = toLiters().toUnit(Teraliter(1.0))