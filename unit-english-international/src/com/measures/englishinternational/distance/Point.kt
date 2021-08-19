package com.measures.englishinternational.distance

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Point(override val value: Double) : UnitDistance<Point> {
    override fun asType(d: Double) = Point(d);
    override fun toMeters() = Pica(value / 12.0).toMeters()
}

fun Meters.asPoint() = toUnit(Point(1.0))
fun UnitDistance<*>.toPoint() = toMeters().asPoint()
