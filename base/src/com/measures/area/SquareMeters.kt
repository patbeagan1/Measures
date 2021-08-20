package com.measures.area

import com.measures.BaseUnit

@JvmInline
value class SquareMeters(override val value: Double) : UnitArea<SquareMeters>, BaseUnit {
    override fun asType(d: Double): SquareMeters = SquareMeters(d)
    override fun asBaseUnit(): SquareMeters = this
}