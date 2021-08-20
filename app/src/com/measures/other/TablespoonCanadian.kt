package com.measures.other

import com.measures.volume.Liter
import com.measures.volume.UnitVolume

@JvmInline
value class TablespoonCanadian(override val value: Double) : UnitVolume<TablespoonCanadian> {
    override fun asType(d: Double) = TablespoonCanadian(d)
    override fun toLiters() = Liter(value * 1.42065E-05 * 1000)
}

fun UnitVolume<*>.toTablespoonCanadian() = toLiters().toUnit(TablespoonCanadian(1.0))