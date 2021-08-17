package com.measures.americancustomary.distance

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Foot(override val value: Double) : UnitDistance<Foot> {
    override fun asType(d: Double) = Foot(d);
    override fun toMeters() = (Inch(12.0) * value).toMeters()
}

fun Meters.asFoot() = toUnit(Foot(1.0))
fun UnitDistance<*>.toFoot() = toMeters().asFoot()
