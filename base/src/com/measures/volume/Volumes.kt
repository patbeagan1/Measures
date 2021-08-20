package com.measures.volume

import com.measures.DoubleBase
import com.measures.UnitTypedFull
import com.measures.area.SquareMeters
import com.measures.area.UnitAreaTypedFull
import com.measures.distance.Meters
import com.measures.distance.UnitDistanceTypedFull

typealias UnitVolume<T> = UnitVolumeTypedFull<T, T>

interface UnitVolumeTypedFull<S, T : DoubleBase<S>> : UnitTypedFull<S, T> {
    operator fun plus(other: UnitVolumeTypedFull<*, *>) =
        Liter(this.toLiters().value + other.toLiters().value)

    operator fun minus(other: UnitVolumeTypedFull<*, *>) =
        Liter(this.toLiters().value - other.toLiters().value)

    operator fun div(other: UnitAreaTypedFull<*, *>) =
        Meters(this.toLiters().value / other.toSquareMeters().value)

    operator fun div(other: UnitDistanceTypedFull<*, *>) =
        SquareMeters(this.toLiters().value / other.toMeters().value)

    fun toLiters(): Liter
    fun <V, U: UnitVolume<V>> toUnit(t: U): V = toLiters().toUnitInternal(t)
}


