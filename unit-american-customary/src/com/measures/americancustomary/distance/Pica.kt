package com.measures.americancustomary.distance

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Pica(override val value: Double) : UnitDistance<Pica> {
    override fun asType(d: Double) = Pica(d);
    override fun toMeters() = (Point(12.0) * value).toMeters()
}

fun Meters.asPica() = toUnit(Pica(1.0))
fun UnitDistance<*>.toPica() = toMeters().asPica()
