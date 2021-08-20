package com.measures.imperial.distance

@JvmInline
value class SurveyRod(override val value: Double) : UnitDistance<SurveyRod> {
    override fun asType(d: Double) = SurveyRod(d);
    override fun asBaseUnit() = SurveyLink(value * 25.0).asBaseUnit()
}

fun UnitDistance<*>.toSurveyRod() = toUnit(SurveyRod(1.0))
