package com.measures.volume.usacustomary

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class BarrelUSADry(override val value: Double) : UnitVolume<BarrelUSADry> {
    override fun asType(d: Double) = BarrelUSADry(d)
    override fun toLiters() = Liters(value * 0.115628199 * 1000)
}