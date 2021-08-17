package com.measures.distance

@JvmInline
value class Meters(override val value: Double) : UnitDistance<Meters> {
    override fun asType(d: Double) = Meters(d)
    override fun toMeters() = this
    fun <R, T : UnitDistance<R>> toUnit(u: T) = u.asType(this.value / u.toMeters().value)
}