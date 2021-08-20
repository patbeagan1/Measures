package com.measures.international.area

import com.measures.area.UnitArea

@JvmInline
value class InternationalSquareMile(override val value: Double) : UnitArea<InternationalSquareMile> {
    override fun asType(d: Double) = InternationalSquareMile(d);
    override fun toSquareMeters() = InternationalSquareYard(value * 1760 * 1760).toSquareMeters()
}

fun UnitArea<*>.toInternationalSquareMile() = toSquareMeters().toUnit(InternationalSquareMile(1.0))
