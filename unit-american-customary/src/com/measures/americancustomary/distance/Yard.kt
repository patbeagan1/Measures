package com.measures.americancustomary.distance

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Yard(override val value: Double) : UnitDistance<Yard> {
    override fun asType(d: Double) = Yard(d);
    override fun toMeters() = (Foot(3.0) * value).toMeters()
}

fun Meters.asYard() = toUnit(Yard(1.0))
fun UnitDistance<*>.toYard() = toMeters().asYard()
