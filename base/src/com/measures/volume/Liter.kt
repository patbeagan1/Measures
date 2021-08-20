package com.measures.volume

@JvmInline
value class Liter(override val value: Double) : UnitVolume<Liter> {
    override fun asType(d: Double) = Liter(d)
    override fun toLiters() = this
    internal fun <R, T : UnitVolume<R>> toUnitInternal(u: T) = u.asType(this.value / u.toLiters().value)
}