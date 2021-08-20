package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class Kiloliter(override val value: Double) : UnitVolume<Kiloliter> {
    override fun asType(d: Double) = Kiloliter(d);
    override fun toLiters() = Liter(value * Consts.KILO)
}

fun UnitVolume<*>.toKiloliter() = toLiters().toUnit(Kiloliter(1.0))