package com.measures.volume.fluid

import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class USShot(override val value: Double) : UnitVolume<USShot> {
    override fun asType(d: Double) = USShot(d);
    override fun toLiters() = USTablespoon(value * 1.5).toLiters()
}

fun Liter.asUSShot() = toUnit(USShot(1.0))
fun UnitVolume<*>.toUSShot() = toLiters().asUSShot()
