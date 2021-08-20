package com.measures.volume.fluid

import com.measures.volume.UnitVolume

@JvmInline
value class USMinim(override val value: Double) : UnitVolume<USMinim> {
    override fun asType(d: Double) = USMinim(d);
    override fun toLiters() = USFluidDram(value / 60.0).toLiters()
}

fun UnitVolume<*>.toUSMinim() = toLiters().toUnit(USMinim(1.0))
