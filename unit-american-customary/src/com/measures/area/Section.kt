package com.measures.area

@JvmInline
value class Section(override val value: Double) : UnitArea<Section> {
    override fun asType(d: Double) = Section(d);
    override fun toSquareMeters() = Acre(value * 640).toSquareMeters()
}

fun SquareMeters.asSection() = toUnit(Section(1.0))
fun UnitArea<*>.toSection() = toSquareMeters().asSection()
