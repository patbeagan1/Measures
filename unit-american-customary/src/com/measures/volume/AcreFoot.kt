package com.measures.volume

@JvmInline
value class Acrefoot(override val value: Double) : UnitVolume<Acrefoot> {
    override fun asType(d: Double) = Acrefoot(d)
    override fun toLiters() = Liter(value * 1233.481838 * 1000)
}

fun UnitVolume<*>.toAcrefoot() = toLiters().toUnit(Acrefoot(1.0))