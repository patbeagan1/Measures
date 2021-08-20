package com.measures.metric.volume

import com.measures.Consts
import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class Yoctoliter(override val value: Double) : UnitVolume<Yoctoliter> {
    override fun asType(d: Double) = Yoctoliter(d);
    override fun asBaseUnit() = Liter(value * Consts.YOCTO)
}

fun UnitVolume<*>.toYoctoliter() = toUnit(Yoctoliter(1.0))