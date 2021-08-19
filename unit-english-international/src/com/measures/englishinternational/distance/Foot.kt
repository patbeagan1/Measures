package com.measures.englishinternational.distance

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Foot(override val value: Double) : UnitDistance<Foot> {
    override fun asType(d: Double) = Foot(d);
    override fun toMeters() = Yard(value / 3.0).toMeters()
}

fun Meters.asFoot() = toUnit(Foot(1.0))
fun UnitDistance<*>.toFoot() = toMeters().asFoot()
