package com.measures.volume.fluid

import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class USTablespoon(override val value: Double) : UnitVolume<USTablespoon> {
    override fun asType(d: Double) = USTablespoon(d);
    override fun toLiters() = USFluidOunce(value / 2.0).toLiters()
}

fun Liter.asTablespoon() = toUnit(USTablespoon(1.0))
fun UnitVolume<*>.toTablespoon() = toLiters().asTablespoon()
