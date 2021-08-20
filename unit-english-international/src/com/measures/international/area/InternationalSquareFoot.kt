package com.measures.international.area

import com.measures.area.SquareMeters
import com.measures.area.UnitArea

@JvmInline
value class InternationalSquareFoot(override val value: Double) : UnitArea<InternationalSquareFoot> {
    override fun asType(d: Double) = InternationalSquareFoot(d);
    override fun toSquareMeters() = SquareMeters(value * 0.09290 )
}

fun UnitArea<*>.toInternationalSquareFoot() = toSquareMeters().toUnit(InternationalSquareFoot(1.0))