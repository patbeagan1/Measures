package com.measures.imperial.volume.fluid

import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class USShot(override val value: Double) : UnitVolume<USShot> {
    override fun asType(d: Double) = USShot(d);
    override fun asBaseUnit() = USTablespoon(value * 1.5).asBaseUnit()
}

fun Liter.asUSShot() = toUnit(USShot(1.0))
fun UnitVolume<*>.toUSShot() = asBaseUnit().asUSShot()
