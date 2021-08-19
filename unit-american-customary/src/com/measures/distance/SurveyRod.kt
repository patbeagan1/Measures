package com.measures.distance

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class SurveyRod(override val value: Double) : UnitDistance<SurveyRod> {
    override fun asType(d: Double) = SurveyRod(d);
    override fun toMeters() = SurveyLink(value * 25.0).toMeters()
}

fun Meters.asSurveyRod() = toUnit(SurveyRod(1.0))
fun UnitDistance<*>.toSurveyRod() = toMeters().asSurveyRod()
