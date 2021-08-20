package com.measures.distance

@JvmInline
value class SurveyRod(override val value: Double) : UnitDistance<SurveyRod> {
    override fun asType(d: Double) = SurveyRod(d);
    override fun toMeters() = SurveyLink(value * 25.0).toMeters()
}

fun UnitDistance<*>.toSurveyRod() = toMeters().toUnit(SurveyRod(1.0))
