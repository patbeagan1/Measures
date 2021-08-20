package com.measures.imperial.distance

@JvmInline
value class SurveyChain(override val value: Double) : UnitDistance<SurveyChain> {
    override fun asType(d: Double) = SurveyChain(d);
    override fun asBaseUnit() = SurveyRod(4.0 * value).asBaseUnit()
}

fun UnitDistance<*>.toSurveyChain() = toUnit(SurveyChain(1.0))
