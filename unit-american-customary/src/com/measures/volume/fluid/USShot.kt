package com.measures.volume.fluid

import com.measures.volume.UnitVolume

@JvmInline
value class USShot(override val value: Double) : UnitVolume<USShot> {
    override fun asType(d: Double) = USShot(d);
    override fun toLiters() = Tablespoon(value * 1.5).toLiters()
}