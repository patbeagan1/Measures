package com.measures.americancustomary.distance.survey

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class SurveyRod(override val value: Double) : UnitDistance<SurveyRod> {
    override fun asType(d: Double) = SurveyRod(d);
    override fun toMeters() = (SurveyLink(25.0) * value).toMeters()
}

fun Meters.asSurveyRod() = toUnit(SurveyRod(1.0))
fun UnitDistance<*>.toSurveyRod() = toMeters().asSurveyRod()
