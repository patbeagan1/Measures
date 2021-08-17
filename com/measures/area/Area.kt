package com.measures.area

import com.measures.DoubleBase
import com.measures.UnitTypedFull
import com.measures.distance.Meters
import com.measures.distance.UnitDistanceTypedFull
import com.measures.volume.cubic.CubicMeter

typealias UnitArea<T> = UnitAreaTypedFull<T, T>

interface UnitAreaTypedFull<S, T : DoubleBase<S>> : UnitTypedFull<S, T> {
    operator fun plus(other: UnitAreaTypedFull<*, *>): SquareMeters =
        SquareMeters(this.toSquareMeters().value + other.toSquareMeters().value)

    operator fun minus(other: UnitAreaTypedFull<*, *>): SquareMeters =
        SquareMeters(this.toSquareMeters().value - other.toSquareMeters().value)

    operator fun div(other: UnitDistanceTypedFull<*, *>): Meters =
        Meters(this.toSquareMeters().value / other.toMeters().value)

    operator fun times(other: UnitDistanceTypedFull<*, *>): CubicMeter =
        CubicMeter(this.toSquareMeters().value * other.toMeters().value)

    fun toSquareMeters(): SquareMeters
}

@JvmInline
value class SquareMeters(override val value: Double) : UnitArea<SquareMeters> {
    override fun asType(d: Double): SquareMeters = SquareMeters(d)
    override fun toSquareMeters(): SquareMeters = this
}