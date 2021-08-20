package com.measures.imperial.distance

@JvmInline
value class SurveyLeague(override val value: Double) : UnitDistance<SurveyLeague> {
    override fun asType(d: Double) = SurveyLeague(d);
    override fun asBaseUnit() = SurveyMile(value * 3.0).asBaseUnit()
}

fun UnitDistance<*>.toSurveyLeague() = toUnit(SurveyLeague(1.0))
