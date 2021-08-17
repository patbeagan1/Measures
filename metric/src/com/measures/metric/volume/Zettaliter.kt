package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Zettaliter(override val value: Double) : UnitVolume<Zettaliter> {
    override fun asType(d: Double) = Zettaliter(d);
    override fun toLiters() = Liters(value * Consts.ZETTA)
}

fun Liters.asZettaliter() = toUnit(Zettaliter(1.0))
fun UnitVolume<*>.toZettaliter() = toLiters().asZettaliter()