package com.measures.area

@JvmInline
value class SurveyTownship(override val value: Double) : UnitArea<SurveyTownship> {
    override fun asType(d: Double) = SurveyTownship(d)
    override fun toSquareMeters() = Section(value * 36.0).toSquareMeters()
}

fun SquareMeters.asSurveyTownship() = toUnit(SurveyTownship(1.0))
fun UnitArea<*>.toSurveyTownship() = toSquareMeters().asSurveyTownship()
