package com.measures.distance

@JvmInline
value class SurveyChain(override val value: Double) : UnitDistance<SurveyChain> {
    override fun asType(d: Double) = SurveyChain(d);
    override fun toMeters() = SurveyRod(4.0 * value).toMeters()
}

fun UnitDistance<*>.toSurveyChain() = toMeters().toUnit(SurveyChain(1.0))
