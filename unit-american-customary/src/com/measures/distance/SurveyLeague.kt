package com.measures.distance

@JvmInline
value class SurveyLeague(override val value: Double) : UnitDistance<SurveyLeague> {
    override fun asType(d: Double) = SurveyLeague(d);
    override fun toMeters() = SurveyMile(value * 3.0).toMeters()
}

fun UnitDistance<*>.toSurveyLeague() = toMeters().toUnit(SurveyLeague(1.0))
