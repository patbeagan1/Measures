package com.measures.distance

import com.measures.DoubleBase
import com.measures.UnitTypedFull
import com.measures.area.SquareMeters
import com.measures.area.UnitAreaTypedFull
import com.measures.volume.Liter

typealias UnitDistance<T> = UnitDistanceTypedFull<T, T>

interface UnitDistanceTypedFull<S, T : DoubleBase<S>> : UnitTypedFull<S, T> {
    operator fun plus(other: UnitDistanceTypedFull<*, *>) =
        Meters(this.toMeters().value + other.toMeters().value)

    operator fun minus(other: UnitDistanceTypedFull<*, *>) =
        Meters(this.toMeters().value - other.toMeters().value)

    operator fun times(other: UnitDistanceTypedFull<*, *>) =
        SquareMeters(this.toMeters().value * other.toMeters().value)

    operator fun times(other: UnitAreaTypedFull<*, *>) =
        Liter(this.toMeters().value * other.toSquareMeters().value * 1000)

    fun toMeters(): Meters
}

