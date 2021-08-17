package com.measures.americancustomary.distance.survey

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class SurveyLink(override val value: Double) : UnitDistance<SurveyLink> {
    override fun asType(d: Double) = SurveyLink(d);
    override fun toMeters() = (SurveyFoot(33.0 / 50.0) * value).toMeters()
}

fun Meters.asSurveyLink() = toUnit(SurveyLink(1.0))
fun UnitDistance<*>.toLink() = toMeters().asSurveyLink()
