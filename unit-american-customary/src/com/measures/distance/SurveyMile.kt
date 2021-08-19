package com.measures.distance

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class SurveyMile(override val value: Double) : UnitDistance<SurveyMile> {
    override fun asType(d: Double) = SurveyMile(d);
    override fun toMeters() = (Furlong(8.0) * value).toMeters()
}

fun Meters.asSurveyMile() = toUnit(SurveyMile(1.0))
fun UnitDistance<*>.toSurveyMile() = toMeters().asSurveyMile()
