package com.measures.volume

import com.measures.DoubleBase
import com.measures.UnitTypedFull

typealias UnitVolume<T> = UnitVolumeTypedFull<T, T>

interface UnitVolumeTypedFull<S, T : DoubleBase<S>> : UnitTypedFull<S, T> {
    operator fun plus(other: UnitVolumeTypedFull<*, *>) =
        Liters(this.toLiters().value + other.toLiters().value)

    operator fun minus(other: UnitVolumeTypedFull<*, *>) =
        Liters(this.toLiters().value - other.toLiters().value)

    operator fun div(other: UnitVolumeTypedFull<*, *>) =
        Liters(this.toLiters().value / other.toLiters().value)

    operator fun times(other: UnitVolumeTypedFull<*, *>) =
        Liters(this.toLiters().value * other.toLiters().value)

    fun toLiters(): Liters
}


