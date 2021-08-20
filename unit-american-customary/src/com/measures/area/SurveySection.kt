package com.measures.area

@JvmInline
value class SurveySection(override val value: Double) : UnitArea<SurveySection> {
    override fun asType(d: Double): SurveySection = SurveySection(d)
    override fun asBaseUnit() = SurveyAcre(value * 640).asBaseUnit()
}

fun UnitArea<*>.toSurveySection() = toUnit(SurveySection(1.0))
