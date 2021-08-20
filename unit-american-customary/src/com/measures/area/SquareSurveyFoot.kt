package com.measures.area

@JvmInline
value class SquareSurveyFoot(override val value: Double) : UnitArea<SquareSurveyFoot> {
    override fun asType(d: Double) = SquareSurveyFoot(d)
    override fun toSquareMeters() = SquareMeters(value * 0.09290341)
}

fun UnitArea<*>.toSquareSurveyFoot() = toSquareMeters().toUnit(SquareSurveyFoot(1.0))
