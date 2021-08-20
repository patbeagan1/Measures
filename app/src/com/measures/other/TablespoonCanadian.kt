package com.measures.other

import com.measures.imperial.volume.Liter
import com.measures.imperial.volume.UnitVolume

@JvmInline
value class TablespoonCanadian(override val value: Double) : UnitVolume<TablespoonCanadian> {
    override fun asType(d: Double) = TablespoonCanadian(d)
    override fun asBaseUnit() = Liter(value * 1.42065E-05 * 1000)
}

fun UnitVolume<*>.toTablespoonCanadian() = toUnit(TablespoonCanadian(1.0))