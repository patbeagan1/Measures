package com.measures.area

@JvmInline
value class SquareChain(override val value: Double) : UnitArea<SquareChain> {
    override fun asType(d: Double) = SquareChain(d);
    override fun toSquareMeters() = SquareSurveyFoot(value * 4356.0).toSquareMeters()
}

fun SquareMeters.asSquareChain() = toUnit(SquareChain(1.0))
fun UnitArea<*>.toSquareChain() = toSquareMeters().asSquareChain()
