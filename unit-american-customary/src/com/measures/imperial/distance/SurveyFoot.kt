package com.measures.imperial.distance

@JvmInline
value class SurveyFoot(override val value: Double) : UnitDistance<SurveyFoot> {
    override fun asType(d: Double) = SurveyFoot(d);
    override fun asBaseUnit() = Meters(value * (1200.0 / 3937.0))
}

fun UnitDistance<*>.toSurveyFoot() = toUnit(SurveyFoot(1.0))
