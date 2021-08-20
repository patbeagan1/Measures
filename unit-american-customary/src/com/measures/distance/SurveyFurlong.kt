package com.measures.distance

@JvmInline
value class SurveyFurlong(override val value: Double) : UnitDistance<SurveyFurlong> {
    override fun asType(d: Double) = SurveyFurlong(d);
    override fun toMeters() = SurveyChain(value * 10.0).toMeters()
}

fun UnitDistance<*>.toSurveyFurlong() = toMeters().toUnit(SurveyFurlong(1.0))
