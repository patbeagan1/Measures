package com.measures.international.area

import com.measures.area.UnitArea

@JvmInline
value class InternationalSquareYard(override val value: Double) : UnitArea<InternationalSquareYard> {
    override fun asType(d: Double) = InternationalSquareYard(d);
    override fun asBaseUnit() = InternationalSquareFoot(value * 9).asBaseUnit()
}

fun UnitArea<*>.toInternationalSquareYard() = toUnit(InternationalSquareYard(1.0))
