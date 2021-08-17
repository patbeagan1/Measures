package com.measures.volume.metric

import com.measures.Consts
import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class Yoctoliter(override val value: Double) : UnitVolume<Yoctoliter> {
    override fun asType(d: Double) = Yoctoliter(d);
    override fun toLiters() = Liters(value * Consts.YOCTO)
}