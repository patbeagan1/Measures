package com.measures.distance

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Inches(override val value: Double) : UnitDistance<Inches> {
    override fun asType(d: Double) = Inches(d)
    override fun toMeters() = Meters(this.value * 0.0254)
}

fun Meters.asInches() = toUnit(Inches(1.0))
fun UnitDistance<*>.toInches() = toMeters().asInches()