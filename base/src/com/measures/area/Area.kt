package com.measures.area

import com.measures.DoubleBase
import com.measures.UnitTypedFull
import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistanceTypedFull
import com.measures.imperial.volume.Liter

typealias UnitArea<T> = UnitAreaTypedFull<T>

interface UnitAreaTypedFull<T : DoubleBase> : UnitTypedFull<T, SquareMeters> {
    operator fun plus(other: UnitAreaTypedFull<*>): SquareMeters =
        SquareMeters(this.asBaseUnit().value + other.asBaseUnit().value)

    operator fun minus(other: UnitAreaTypedFull<*>): SquareMeters =
        SquareMeters(this.asBaseUnit().value - other.asBaseUnit().value)

    operator fun div(other: UnitDistanceTypedFull<*>): Meters =
        Meters(this.asBaseUnit().value / other.asBaseUnit().value)

    operator fun times(other: UnitDistanceTypedFull<*>): Liter =
        Liter(this.asBaseUnit().value * other.asBaseUnit().value * 1000)

    override fun asBaseUnit(): SquareMeters
}
