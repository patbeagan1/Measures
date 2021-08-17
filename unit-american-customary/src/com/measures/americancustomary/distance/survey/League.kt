package com.measures.americancustomary.distance.survey

import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class League(override val value: Double) : UnitDistance<League> {
    override fun asType(d: Double) = League(d);
    override fun toMeters() = (SurveyMile(3.0) * value).toMeters()
}

fun Meters.asLeague() = toUnit(League(1.0))
fun UnitDistance<*>.toLeague() = toMeters().asLeague()
