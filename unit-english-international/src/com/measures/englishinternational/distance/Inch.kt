package com.measures.englishinternational.distance

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Inch(override val value: Double) : UnitDistance<Inch> {
    override fun asType(d: Double) = Inch(d);
    override fun toMeters() = Foot(value / 12.0).toMeters()
}

fun Meters.asInch() = toUnit(Inch(1.0))
fun UnitDistance<*>.toInch() = toMeters().asInch()
