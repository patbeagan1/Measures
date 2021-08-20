package com.measures.area

@JvmInline
value class SurveySection(override val value: Double) : UnitArea<SurveySection> {
    override fun asType(d: Double): SurveySection = SurveySection(d)
    override fun toSquareMeters() = SurveyAcre(value * 640).toSquareMeters()
}

fun UnitArea<*>.toSurveySection() = toSquareMeters().toUnit(SurveySection(1.0))
