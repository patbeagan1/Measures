package com.measures.area

@JvmInline
value class SquareSurveyChain(override val value: Double) : UnitArea<SquareSurveyChain> {
    override fun asType(d: Double) = SquareSurveyChain(d);
    override fun toSquareMeters() = SquareSurveyFoot(value * 4356.0).toSquareMeters()
}

fun UnitArea<*>.toSquareSurveyChain() = toSquareMeters().toUnit(SquareSurveyChain(1.0))
