package com.measures.volume.fluid

import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class USTeaspoon(override val value: Double) : UnitVolume<USTeaspoon> {
    override fun asType(d: Double) = USTeaspoon(d);
    override fun toLiters() = USTablespoon(value / 3.0).toLiters()
}

fun Liter.asUSTeaspoon() = toUnit(USTeaspoon(1.0))
fun UnitVolume<*>.toUSTeaspoon() = toLiters().asUSTeaspoon()
