package com.measures.international.area

import com.measures.area.UnitArea

@JvmInline
value class InternationalSquareYard(override val value: Double) : UnitArea<InternationalSquareYard> {
    override fun asType(d: Double) = InternationalSquareYard(d);
    override fun toSquareMeters() = InternationalSquareFoot(value * 9).toSquareMeters()
}

fun UnitArea<*>.toInternationalSquareYard() = toSquareMeters().toUnit(InternationalSquareYard(1.0))
