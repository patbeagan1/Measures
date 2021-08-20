package com.measures.metric.volume

import com.measures.Consts
import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class Zettaliter(override val value: Double) : UnitVolume<Zettaliter> {
    override fun asType(d: Double) = Zettaliter(d);
    override fun asBaseUnit() = Liter(value * Consts.ZETTA)
}

fun UnitVolume<*>.toZettaliter() = toUnit(Zettaliter(1.0))