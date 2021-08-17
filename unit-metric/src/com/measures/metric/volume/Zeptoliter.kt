package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Zeptoliter(override val value: Double) : UnitVolume<Zeptoliter> {
    override fun asType(d: Double) = Zeptoliter(d);
    override fun toLiters() = Liters(value * Consts.ZEPTO)
}

fun Liters.asZeptoliter() = toUnit(Zeptoliter(1.0))
fun UnitVolume<*>.toZeptoliter() = toLiters().asZeptoliter()