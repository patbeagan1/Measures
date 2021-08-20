package com.measures.international.area

import com.measures.area.UnitArea

@JvmInline
value class InternationalSquareInch(override val value: Double) : UnitArea<InternationalSquareInch> {
    override fun asType(d: Double) = InternationalSquareInch(d);
    override fun asBaseUnit() = InternationalSquareFoot(value / 144.0).asBaseUnit()
}

fun UnitArea<*>.toInternationalSquareInch() = toUnit(InternationalSquareInch(1.0))