package com.measures.volume.usacustomary

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class TeaspoonUSA(override val value: Double) : UnitVolume<TeaspoonUSA> {
    override fun asType(d: Double) = TeaspoonUSA(d)
    override fun toLiters() = Liters(value * 4.92892E-06 * 1000)
}