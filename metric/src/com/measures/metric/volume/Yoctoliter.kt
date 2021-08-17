package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Yoctoliter(override val value: Double) : UnitVolume<Yoctoliter> {
    override fun asType(d: Double) = Yoctoliter(d);
    override fun toLiters() = Liters(value * Consts.YOCTO)
}

fun Liters.asYoctoliter() = toUnit(Yoctoliter(1.0))
fun UnitVolume<*>.toYoctoliter() = toLiters().asYoctoliter()