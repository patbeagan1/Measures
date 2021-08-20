package com.measures.metric.volume

import com.measures.Consts
import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class Yoctoliter(override val value: Double) : UnitVolume<Yoctoliter> {
    override fun asType(d: Double) = Yoctoliter(d);
    override fun toLiters() = Liter(value * Consts.YOCTO)
}

fun UnitVolume<*>.toYoctoliter() = toLiters().toUnit(Yoctoliter(1.0))