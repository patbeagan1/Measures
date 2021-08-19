package com.measures.distance

@JvmInline
value class Furlong(override val value: Double) : UnitDistance<Furlong> {
    override fun asType(d: Double) = Furlong(d);
    override fun toMeters() = SurveyChain(value * 10.0).toMeters()
}

fun Meters.asFurlong() = toUnit(Furlong(1.0))
fun UnitDistance<*>.toFurlong() = toMeters().asFurlong()
