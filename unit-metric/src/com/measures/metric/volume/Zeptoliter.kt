package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class Zeptoliter(override val value: Double) : UnitVolume<Zeptoliter> {
    override fun asType(d: Double) = Zeptoliter(d);
    override fun toLiters() = Liter(value * Consts.ZEPTO)
}

fun UnitVolume<*>.toZeptoliter() = toLiters().toUnit(Zeptoliter(1.0))