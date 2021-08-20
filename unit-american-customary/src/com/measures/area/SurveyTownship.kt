package com.measures.area

@JvmInline
value class SurveyTownship(override val value: Double) : UnitArea<SurveyTownship> {
    override fun asType(d: Double) = SurveyTownship(d)
    override fun toSquareMeters() = SurveySection(value * 36.0).toSquareMeters()
}

fun UnitArea<*>.toSurveyTownship() = toSquareMeters().toUnit(SurveyTownship(1.0))
