package com.measures.area

@JvmInline
value class SurveyTownship(override val value: Double) : UnitArea<SurveyTownship> {
    override fun asType(d: Double) = SurveyTownship(d)
    override fun asBaseUnit() = SurveySection(value * 36.0).asBaseUnit()
}

fun UnitArea<*>.toSurveyTownship() = toUnit(SurveyTownship(1.0))
