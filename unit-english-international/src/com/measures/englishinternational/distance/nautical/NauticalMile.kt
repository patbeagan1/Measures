package com.measures.englishinternational.distance.nautical

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class NauticalMile(override val value: Double) : UnitDistance<NauticalMile> {
    override fun asType(d: Double) = NauticalMile(d);
    override fun toMeters() = Cable(value * 8.439).toMeters()
}

fun Meters.asNauticalMile() = toUnit(NauticalMile(1.0))
fun UnitDistance<*>.toNauticalMile() = toMeters().asNauticalMile()
