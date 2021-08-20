package com.measures.imperial.volume

import com.measures.BaseUnit

@JvmInline
value class Liter(override val value: Double) : UnitVolume<Liter>, BaseUnit {
    override fun asType(d: Double) = Liter(d)
    override fun asBaseUnit() = this
}

fun UnitVolume<*>.toLiter() = this.asBaseUnit()