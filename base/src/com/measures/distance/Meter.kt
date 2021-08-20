package com.measures.distance

import com.measures.BaseUnit

@JvmInline
value class Meter(override val value: Double) : UnitDistance<Meter>, BaseUnit {
    override fun asType(d: Double) = Meter(d)
    override fun asBaseUnit() = this
}