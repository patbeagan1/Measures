package com.measures.metric.distance

import com.measures.Consts
import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistance

@JvmInline
value class Terameter(override val value: Double) : UnitDistance<Terameter> {
    override fun asType(d: Double) = Terameter(d);
    override fun asBaseUnit() = Meters(value * Consts.TERA)
}

fun UnitDistance<*>.toTerameter() = toUnit(Terameter(1.0))
