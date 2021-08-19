package com.measures.englishinternational.area

import com.measures.area.SquareMeters
import com.measures.area.UnitArea

@JvmInline
value class SquareMile(override val value: Double) : UnitArea<SquareMile> {
    override fun asType(d: Double) = SquareMile(d);
    override fun toSquareMeters() = SquareYard(value * 1760 * 1760).toSquareMeters()
}

fun SquareMeters.asSquareMile() = toUnit(SquareMile(1.0))
fun UnitArea<*>.toSquareMile() = toSquareMeters().asSquareMile()
