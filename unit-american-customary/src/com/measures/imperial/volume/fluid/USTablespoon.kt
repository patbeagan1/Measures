package com.measures.imperial.volume.fluid

import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class USTablespoon(override val value: Double) : UnitVolume<USTablespoon> {
    override fun asType(d: Double) = USTablespoon(d);
    override fun asBaseUnit() = USFluidOunce(value / 2.0).asBaseUnit()
}

fun Liter.asTablespoon() = toUnit(USTablespoon(1.0))
fun UnitVolume<*>.toTablespoon() = asBaseUnit().asTablespoon()
