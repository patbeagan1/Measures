package com.measures.englishinternational.area

import com.measures.area.SquareMeters
import com.measures.area.UnitArea

@JvmInline
value class SquareYard(override val value: Double) : UnitArea<SquareYard> {
    override fun asType(d: Double) = SquareYard(d);
    override fun toSquareMeters() = SquareFoot(value * 9).toSquareMeters()
}

fun SquareMeters.asSquareYard() = toUnit(SquareYard(1.0))
fun UnitArea<*>.toSquareYard() = toSquareMeters().asSquareYard()
