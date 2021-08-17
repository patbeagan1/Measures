package com.measures.volume.imperial

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class TablespoonImperial(override val value: Double) : UnitVolume<TablespoonImperial> {
    override fun asType(d: Double) = TablespoonImperial(d)
    override fun toLiters() = Liters(value * 1.77582E-05 * 1000)
}