package com.measures.volume.usacustomary

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class CupUSA(override val value: Double) : UnitVolume<CupUSA> {
    override fun asType(d: Double) = CupUSA(d)
    override fun toLiters() = Liters(value * 0.000236588 * 1000)
}