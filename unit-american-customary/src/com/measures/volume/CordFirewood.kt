package com.measures.volume

@JvmInline
value class CordFirewood(override val value: Double) : UnitVolume<CordFirewood> {
    override fun asType(d: Double) = CordFirewood(d)
    override fun toLiters() = Liter(value * 3.624556364 * 1000)
}

fun UnitVolume<*>.toCordFirewood() = toLiters().toUnit(CordFirewood(1.0))