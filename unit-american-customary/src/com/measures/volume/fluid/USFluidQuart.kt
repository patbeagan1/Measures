package com.measures.volume.fluid

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class USFluidQuart(override val value: Double) : UnitVolume<USFluidQuart> {
    override fun asType(d: Double) = USFluidQuart(d);
    override fun toLiters() = Liters(value * 0.946352946)
}