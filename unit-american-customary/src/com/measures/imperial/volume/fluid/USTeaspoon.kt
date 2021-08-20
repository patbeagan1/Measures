package com.measures.imperial.volume.fluid

import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class USTeaspoon(override val value: Double) : UnitVolume<USTeaspoon> {
    override fun asType(d: Double) = USTeaspoon(d);
    override fun asBaseUnit() = USTablespoon(value / 3.0).asBaseUnit()
}

fun Liter.asUSTeaspoon() = toUnit(USTeaspoon(1.0))
fun UnitVolume<*>.toUSTeaspoon() = asBaseUnit().asUSTeaspoon()
