package com.measures.imperial.distance

@JvmInline
value class SurveyFurlong(override val value: Double) : UnitDistance<SurveyFurlong> {
    override fun asType(d: Double) = SurveyFurlong(d);
    override fun asBaseUnit() = SurveyChain(value * 10.0).asBaseUnit()
}

fun UnitDistance<*>.toSurveyFurlong() = toUnit(SurveyFurlong(1.0))
