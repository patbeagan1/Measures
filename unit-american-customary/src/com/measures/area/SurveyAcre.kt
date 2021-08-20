package com.measures.area

@JvmInline
value class SurveyAcre(override val value: Double) : UnitArea<SurveyAcre> {
    override fun asType(d: Double) = SurveyAcre(d);
    override fun toSquareMeters() = SquareSurveyChain(value * 10.0).toSquareMeters()
}

fun UnitArea<*>.toSurveyAcre() = toSquareMeters().toUnit(SurveyAcre(1.0))
