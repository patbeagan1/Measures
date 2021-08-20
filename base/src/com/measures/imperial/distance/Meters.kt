package com.measures.imperial.distance

import com.measures.BaseUnit

@JvmInline
value class Meters(override val value: Double) : UnitDistance<Meters>, BaseUnit {
    override fun asType(d: Double) = Meters(d)
    override fun asBaseUnit() = this
}