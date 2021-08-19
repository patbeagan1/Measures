package com.measures.englishinternational.distance

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Pica(override val value: Double) : UnitDistance<Pica> {
    override fun asType(d: Double) = Pica(d);
    override fun toMeters() = Inch(value / 6.0).toMeters()
}

fun Meters.asPica() = toUnit(Pica(1.0))
fun UnitDistance<*>.toPica() = toMeters().asPica()
