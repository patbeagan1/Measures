package com.measures.volume.usacustomary

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class TablespoonUSA(override val value: Double) : UnitVolume<TablespoonUSA> {
    override fun asType(d: Double) = TablespoonUSA(d)
    override fun toLiters() = Liters(value * 1.47868E-05 * 1000)
}