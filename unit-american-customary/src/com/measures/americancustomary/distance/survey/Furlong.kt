package com.measures.americancustomary.distance.survey

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Furlong(override val value: Double) : UnitDistance<Furlong> {
    override fun asType(d: Double) = Furlong(d);
    override fun toMeters() = (SurveyChain(25.0) * value).toMeters()
}

fun Meters.asFurlong() = toUnit(Furlong(1.0))
fun UnitDistance<*>.toFurlong() = toMeters().asFurlong()
