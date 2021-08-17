package com.measures.distance

import com.measures.DoubleBase
import com.measures.UnitTypedFull
import com.measures.area.SquareMeters

typealias UnitDistance<T> = UnitDistanceTypedFull<T, T>

interface UnitDistanceTypedFull<S, T : DoubleBase<S>> : UnitTypedFull<S, T> {
    operator fun plus(other: UnitDistanceTypedFull<*, *>) =
        Meters(this.toMeters().value + other.toMeters().value)

    operator fun minus(other: UnitDistanceTypedFull<*, *>) =
        Meters(this.toMeters().value - other.toMeters().value)

    operator fun times(other: UnitDistanceTypedFull<*, *>) =
        SquareMeters(this.toMeters().value * other.toMeters().value)

    fun toMeters(): Meters
}

