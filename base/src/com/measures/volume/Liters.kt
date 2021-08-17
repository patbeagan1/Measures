package com.measures.volume

@JvmInline
value class Liters(override val value: Double) : UnitVolume<Liters> {
    override fun asType(d: Double) = Liters(d)
    override fun toLiters() = this
    fun <R, T : UnitVolume<R>> toUnit(u: T) = u.asType((this / u.toLiters()).value)
}