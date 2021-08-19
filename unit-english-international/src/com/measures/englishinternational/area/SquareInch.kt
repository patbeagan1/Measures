package com.measures.englishinternational.area

import com.measures.area.SquareMeters
import com.measures.area.UnitArea

@JvmInline
value class SquareInch(override val value: Double) : UnitArea<SquareInch> {
    override fun asType(d: Double) = SquareInch(d);
    override fun toSquareMeters() = SquareFoot(value / 144.0).toSquareMeters()
}

fun SquareMeters.asSquareInch() = toUnit(SquareInch(1.0))
fun UnitArea<*>.toSquareInch() = toSquareMeters().asSquareInch()