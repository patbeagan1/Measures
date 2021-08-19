package com.measures.area

@JvmInline
value class Acre(override val value: Double) : UnitArea<Acre> {
    override fun asType(d: Double) = Acre(d);
    override fun toSquareMeters() = SquareChain(value * 10.0).toSquareMeters()
}

fun SquareMeters.asAcre() = toUnit(Acre(1.0))
fun UnitArea<*>.toAcre() = toSquareMeters().asAcre()
