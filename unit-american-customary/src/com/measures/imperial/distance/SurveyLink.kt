package com.measures.imperial.distance

@JvmInline
value class SurveyLink(override val value: Double) : UnitDistance<SurveyLink> {
    override fun asType(d: Double) = SurveyLink(d);
    override fun asBaseUnit() = (SurveyFoot(33.0 / 50.0) * value).asBaseUnit()
}

fun UnitDistance<*>.toLink() = toUnit(SurveyLink(1.0))
