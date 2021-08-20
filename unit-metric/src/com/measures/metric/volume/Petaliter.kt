package com.measures.metric.volume

import com.measures.Consts
import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class Petaliter(override val value: Double) : UnitVolume<Petaliter> {
    override fun asType(d: Double) = Petaliter(d);
    override fun asBaseUnit() = Liter(value * Consts.PETA)
}

fun UnitVolume<*>.toPetaliter() = toUnit(Petaliter(1.0))