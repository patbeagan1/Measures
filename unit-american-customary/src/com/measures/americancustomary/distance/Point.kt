package com.measures.americancustomary.distance

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Point(override val value: Double) : UnitDistance<Point> {
    override fun asType(d: Double) = Point(d);
    override fun toMeters() = Meters(value * (127.0 / 360.0) / 1000.0)
}

fun Meters.asPoint() = toUnit(Point(1.0))
fun UnitDistance<*>.toPoint() = toMeters().asPoint()
