package com.measures.area

@JvmInline
value class SquareMeters(override val value: Double) : UnitArea<SquareMeters> {
    override fun asType(d: Double): SquareMeters = SquareMeters(d)
    override fun toSquareMeters(): SquareMeters = this
    fun <R, T : UnitArea<R>> toUnit(u: T) = u.asType(this.value / u.toSquareMeters().value)
}