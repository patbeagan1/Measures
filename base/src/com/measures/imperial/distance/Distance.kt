package com.measures.imperial.distance

import com.measures.DoubleBase
import com.measures.UnitTypedFull
import com.measures.area.SquareMeters
import com.measures.area.UnitAreaTypedFull
import com.measures.imperial.volume.Liter

typealias UnitDistance<T> = UnitDistanceTypedFull<T>

interface UnitDistanceTypedFull<T : DoubleBase> : UnitTypedFull<T, Meters> {
    operator fun plus(other: UnitDistanceTypedFull<*>) =
        Meters(this.asBaseUnit().value + other.asBaseUnit().value)

    operator fun minus(other: UnitDistanceTypedFull<*>) =
        Meters(this.asBaseUnit().value - other.asBaseUnit().value)

    operator fun times(other: UnitDistanceTypedFull<*>) =
        SquareMeters(this.asBaseUnit().value * other.asBaseUnit().value)

    operator fun times(other: UnitAreaTypedFull<*>) =
        Liter(this.asBaseUnit().value * other.asBaseUnit().value * 1000)

    override fun asBaseUnit(): Meters
}

