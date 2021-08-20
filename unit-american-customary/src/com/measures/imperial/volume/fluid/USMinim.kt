package com.measures.imperial.volume.fluid

import com.measures.imperial.volume.UnitVolume

@JvmInline
value class USMinim(override val value: Double) : UnitVolume<USMinim> {
    override fun asType(d: Double) = USMinim(d);
    override fun asBaseUnit() = USFluidDram(value / 60.0).asBaseUnit()
}

fun UnitVolume<*>.toUSMinim() = toUnit(USMinim(1.0))
