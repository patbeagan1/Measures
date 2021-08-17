package com.measures.volume.other

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class BarrelPetroleum(override val value: Double) : UnitVolume<BarrelPetroleum> {
    override fun asType(d: Double) = BarrelPetroleum(d)
    override fun toLiters() = Liters(value * 0.158987295 * 1000)
}