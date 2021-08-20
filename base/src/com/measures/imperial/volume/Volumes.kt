package com.measures.imperial.volume

import com.measures.DoubleBase
import com.measures.UnitTypedFull
import com.measures.area.SquareMeters
import com.measures.area.UnitAreaTypedFull
import com.measures.imperial.distance.Meters
import com.measures.imperial.distance.UnitDistanceTypedFull

typealias UnitVolume<T> = UnitVolumeTypedFull<T>

interface UnitVolumeTypedFull<T : DoubleBase> : UnitTypedFull<T, Liter> {
    operator fun plus(other: UnitVolumeTypedFull<*>) =
        Liter(this.asBaseUnit().value + other.asBaseUnit().value)

    operator fun minus(other: UnitVolumeTypedFull<*>) =
        Liter(this.asBaseUnit().value - other.asBaseUnit().value)

    operator fun div(other: UnitAreaTypedFull<*>) =
        Meters(this.asBaseUnit().value / other.asBaseUnit().value)

    operator fun div(other: UnitDistanceTypedFull<*>) =
        SquareMeters(this.asBaseUnit().value / other.asBaseUnit().value)

    override fun asBaseUnit(): Liter
}


