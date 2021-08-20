package com.measures.distance

@JvmInline
value class SurveyFoot(override val value: Double) : UnitDistance<SurveyFoot> {
    override fun asType(d: Double) = SurveyFoot(d);
    override fun toMeters() = Meters(value * (1200.0 / 3937.0))
}

fun UnitDistance<*>.toSurveyFoot() = toMeters().toUnit(SurveyFoot(1.0))
