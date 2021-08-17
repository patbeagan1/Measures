package com.measures.americancustomary.distance.nautical

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class NauticalMile(override val value: Double) : UnitDistance<NauticalMile> {
    override fun asType(d: Double) = NauticalMile(d);
    override fun toMeters() = Meters(value * 1852.0)
}

fun Meters.asNauticalMile() = toUnit(NauticalMile(1.0))
fun UnitDistance<*>.toNauticalMile() = toMeters().asNauticalMile()
