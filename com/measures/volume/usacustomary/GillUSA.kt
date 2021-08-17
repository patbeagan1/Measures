package com.measures.volume.usacustomary

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class GillUSA(override val value: Double) : UnitVolume<GillUSA> {
    override fun asType(d: Double) = GillUSA(d)
    override fun toLiters() = Liters(value * 0.000118294 * 1000)
}