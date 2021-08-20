package com.measures.metric.volume

import com.measures.Consts
import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class Kiloliter(override val value: Double) : UnitVolume<Kiloliter> {
    override fun asType(d: Double) = Kiloliter(d);
    override fun asBaseUnit() = Liter(value * Consts.KILO)
}

fun UnitVolume<*>.toKiloliter() = toUnit(Kiloliter(1.0))