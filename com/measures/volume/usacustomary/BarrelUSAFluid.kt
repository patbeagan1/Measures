package com.measures.volume.usacustomary

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class BarrelUSAFluid(override val value: Double) : UnitVolume<BarrelUSAFluid> {
    override fun asType(d: Double) = BarrelUSAFluid(d)
    override fun toLiters() = Liters(value * 0.119240471 * 1000)
}