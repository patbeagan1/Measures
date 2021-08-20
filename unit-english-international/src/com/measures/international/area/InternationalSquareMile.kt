package com.measures.international.area

import com.measures.area.UnitArea

@JvmInline
value class InternationalSquareMile(override val value: Double) : UnitArea<InternationalSquareMile> {
    override fun asType(d: Double) = InternationalSquareMile(d);
    override fun asBaseUnit() = InternationalSquareYard(value * 1760 * 1760).asBaseUnit()
}

fun UnitArea<*>.toInternationalSquareMile() = toUnit(InternationalSquareMile(1.0))
