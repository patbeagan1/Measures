package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Femtoliter(override val value: Double) : UnitVolume<Femtoliter> {
    override fun asType(d: Double) = Femtoliter(d);
    override fun toLiters() = Liters(value * Consts.FEMTO)
}

fun Liters.asFemtoliter() = toUnit(Femtoliter(1.0))
fun UnitVolume<*>.toFemtoliter() = toLiters().asFemtoliter()