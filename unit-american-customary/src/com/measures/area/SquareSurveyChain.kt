package com.measures.area

@JvmInline
value class SquareSurveyChain(override val value: Double) : UnitArea<SquareSurveyChain> {
    override fun asType(d: Double) = SquareSurveyChain(d);
    override fun asBaseUnit() = SquareSurveyFoot(value * 4356.0).asBaseUnit()
}

fun UnitArea<*>.toSquareSurveyChain() = toUnit(SquareSurveyChain(1.0))
