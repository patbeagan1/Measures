package com.measures.distance

@JvmInline
value class SurveyMile(override val value: Double) : UnitDistance<SurveyMile> {
    override fun asType(d: Double) = SurveyMile(d);
    override fun toMeters() = (SurveyFurlong(8.0) * value).toMeters()
}

fun UnitDistance<*>.toSurveyMile() = toMeters().toUnit(SurveyMile(1.0))
