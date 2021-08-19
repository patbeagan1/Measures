package com.measures.englishinternational.distance.nautical

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Cable(override val value: Double) : UnitDistance<Cable> {
    override fun asType(d: Double) = Cable(d);
    override fun toMeters() = Fathom(value * 120.0).toMeters()
}

fun Meters.asCable() = toUnit(Cable(1.0))
fun UnitDistance<*>.toCable() = toMeters().asCable()
