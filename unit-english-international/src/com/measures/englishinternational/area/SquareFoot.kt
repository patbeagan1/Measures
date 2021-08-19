package com.measures.englishinternational.area

import com.measures.area.SquareMeters
import com.measures.area.UnitArea

@JvmInline
value class SquareFoot(override val value: Double) : UnitArea<SquareFoot> {
    override fun asType(d: Double) = SquareFoot(d);
    override fun toSquareMeters() = SquareMeters(value * 0.09290 )
}

fun SquareMeters.asSquareFoot() = toUnit(SquareFoot(1.0))
fun UnitArea<*>.toSquareFoot() = toSquareMeters().asSquareFoot()