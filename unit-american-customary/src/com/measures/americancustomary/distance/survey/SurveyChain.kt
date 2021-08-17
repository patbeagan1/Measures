package com.measures.americancustomary.distance.survey

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class SurveyChain(override val value: Double) : UnitDistance<SurveyChain> {
    override fun asType(d: Double) = SurveyChain(d);
    override fun toMeters() = (SurveyRod(4.0) * value).toMeters()
}

fun Meters.asSurveyChain() = toUnit(SurveyChain(1.0))
fun UnitDistance<*>.toSurveyChain() = toMeters().asSurveyChain()
