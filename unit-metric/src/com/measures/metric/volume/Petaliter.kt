package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class Petaliter(override val value: Double) : UnitVolume<Petaliter> {
    override fun asType(d: Double) = Petaliter(d);
    override fun toLiters() = Liter(value * Consts.PETA)
}

fun UnitVolume<*>.toPetaliter() = toLiters().toUnit(Petaliter(1.0))