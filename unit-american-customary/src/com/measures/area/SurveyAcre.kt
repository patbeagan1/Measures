package com.measures.area

@JvmInline
value class SurveyAcre(override val value: Double) : UnitArea<SurveyAcre> {
    override fun asType(d: Double) = SurveyAcre(d);
    override fun asBaseUnit() = SquareSurveyChain(value * 10.0).asBaseUnit()
}

fun UnitArea<*>.toSurveyAcre() = toUnit(SurveyAcre(1.0))
