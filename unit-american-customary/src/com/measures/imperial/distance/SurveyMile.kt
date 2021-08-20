package com.measures.imperial.distance

@JvmInline
value class SurveyMile(override val value: Double) : UnitDistance<SurveyMile> {
    override fun asType(d: Double) = SurveyMile(d);
    override fun asBaseUnit() = (SurveyFurlong(8.0) * value).asBaseUnit()
}

fun UnitDistance<*>.toSurveyMile() = toUnit(SurveyMile(1.0))
