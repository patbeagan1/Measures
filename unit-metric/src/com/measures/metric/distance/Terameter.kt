package com.measures.metric.distance

import com.measures.Consts
import com.measures.distance.Meters
import com.measures.distance.UnitDistance

@JvmInline
value class Terameter(override val value: Double) : UnitDistance<Terameter> {
    override fun asType(d: Double) = Terameter(d);
    override fun toMeters() = Meters(value * Consts.TERA)
}

fun UnitDistance<*>.toTerameter() = toMeters().toUnit(Terameter(1.0))
