package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class Zettaliter(override val value: Double) : UnitVolume<Zettaliter> {
    override fun asType(d: Double) = Zettaliter(d);
    override fun toLiters() = Liter(value * Consts.ZETTA)
}

fun UnitVolume<*>.toZettaliter() = toLiters().toUnit(Zettaliter(1.0))