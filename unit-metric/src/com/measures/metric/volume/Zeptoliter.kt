package com.measures.metric.volume

import com.measures.Consts
import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class Zeptoliter(override val value: Double) : UnitVolume<Zeptoliter> {
    override fun asType(d: Double) = Zeptoliter(d);
    override fun asBaseUnit() = Liter(value * Consts.ZEPTO)
}

fun UnitVolume<*>.toZeptoliter() = toUnit(Zeptoliter(1.0))