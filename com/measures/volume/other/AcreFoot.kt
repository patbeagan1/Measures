package com.measures.volume.other

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

@JvmInline
value class AcreFoot(override val value: Double) : UnitVolume<AcreFoot> {
    override fun asType(d: Double) = AcreFoot(d)
    override fun toLiters() = Liters(value * 1233.481838 * 1000)
}