package com.measures.volume.canadian

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class TablespoonCanadian(override val value: Double) : UnitVolume<TablespoonCanadian> {
    override fun asType(d: Double) = TablespoonCanadian(d)
    override fun toLiters() = Liters(value * 1.42065E-05 * 1000)
}