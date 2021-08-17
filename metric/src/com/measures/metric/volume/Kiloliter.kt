package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Kiloliter(override val value: Double) : UnitVolume<Kiloliter> {
    override fun asType(d: Double) = Kiloliter(d);
    override fun toLiters() = Liters(value * Consts.KILO)
}

fun Liters.asKiloliter() = toUnit(Kiloliter(1.0))
fun UnitVolume<*>.toKiloliter() = toLiters().asKiloliter()