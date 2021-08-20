package com.measures.distance

@JvmInline
value class SurveyLink(override val value: Double) : UnitDistance<SurveyLink> {
    override fun asType(d: Double) = SurveyLink(d);
    override fun toMeters() = (SurveyFoot(33.0 / 50.0) * value).toMeters()
}

fun UnitDistance<*>.toLink() = toMeters().toUnit(SurveyLink(1.0))
