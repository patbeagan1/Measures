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
    fun toMils() = toMeters().asMils()
    fun toInches() = toMeters().asInches()
    fun toFeet() = toMeters().asFeet()
    fun toYards() = toMeters().asYards()
    fun toMiles() = toMeters().asMiles()
    fun toCapefeet() = toMeters().asCapefeet()
    fun toRods() = toMeters().asRods()
    fun toAngstroms() = toMeters().asAngstroms()
    fun toNanometers() = toMeters().asNanometers()
    fun toMicrons() = toMeters().asMicrons()
    fun toMillimeters() = toMeters().asMillimeters()
    fun toCentimeters() = toMeters().asCentimeters()
    fun toKilometers() = toMeters().asKilometers()
}

@JvmInline
value class Meters(override val value: Double) : UnitDistance<Meters> {
    override fun asType(d: Double) = Meters(d)
    override fun toMeters() = this
    private fun <R, T : UnitDistance<R>> toUnit(u: T) = u.asType(this.value / u.toMeters().value)
    fun asMils() = toUnit(Mils(1.0))
    fun asInches() = toUnit(Inches(1.0))
    fun asFeet() = toUnit(Feet(1.0))
    fun asYards() = toUnit(Yards(1.0))
    fun asMiles() = toUnit(Miles(1.0))
    fun asCapefeet() = toUnit(Capefeet(1.0))
    fun asRods() = toUnit(Rods(1.0))
    fun asAngstroms() = toUnit(Angstroms(1.0))
    fun asNanometers() = toUnit(Nanometers(1.0))
    fun asMicrons() = toUnit(Microns(1.0))
    fun asMillimeters() = toUnit(Millimeters(1.0))
    fun asCentimeters() = toUnit(Centimeters(1.0))
    fun asKilometers() = toUnit(Kilometers(1.0))
}

@JvmInline
value class Mils(override val value: Double) : UnitDistance<Mils> {
    override fun asType(d: Double) = Mils(d)
    override fun toMeters() = Meters(this.value * 0.0000254)
}

@JvmInline
value class Inches(override val value: Double) : UnitDistance<Inches> {
    override fun asType(d: Double) = Inches(d)
    override fun toMeters() = Meters(this.value * 0.0254)
}

@JvmInline
value class Feet(override val value: Double) : UnitDistance<Feet> {
    override fun asType(d: Double) = Feet(d)
    override fun toMeters() = Meters(this.value * 0.3048)
}

@JvmInline
value class Yards(override val value: Double) : UnitDistance<Yards> {
    override fun asType(d: Double) = Yards(d)
    override fun toMeters() = Meters(this.value * 0.9144)
}

@JvmInline
value class Miles(override val value: Double) : UnitDistance<Miles> {
    override fun asType(d: Double) = Miles(d)
    override fun toMeters() = Meters(this.value * 1609.344)
}

@JvmInline
value class Capefeet(override val value: Double) : UnitDistance<Capefeet> {
    override fun asType(d: Double) = Capefeet(d)
    override fun toMeters() = Meters(this.value * 0.314856)
}

@JvmInline
value class Rods(override val value: Double) : UnitDistance<Rods> {
    override fun asType(d: Double) = Rods(d)
    override fun toMeters() = Meters(this.value * 5.0292)
}

@JvmInline
value class Angstroms(override val value: Double) : UnitDistance<Angstroms> {
    override fun asType(d: Double) = Angstroms(d)
    override fun toMeters() = Meters(this.value * 1E-10)
}

@JvmInline
value class Nanometers(override val value: Double) : UnitDistance<Nanometers> {
    override fun asType(d: Double) = Nanometers(d)
    override fun toMeters() = Meters(this.value * 0.000000001)
}

@JvmInline
value class Microns(override val value: Double) : UnitDistance<Microns> {
    override fun asType(d: Double) = Microns(d)
    override fun toMeters() = Meters(this.value * 0.000001)
}

@JvmInline
value class Millimeters(override val value: Double) : UnitDistance<Millimeters> {
    override fun asType(d: Double) = Millimeters(d)
    override fun toMeters() = Meters(this.value * 0.001)
}

@JvmInline
value class Centimeters(override val value: Double) : UnitDistance<Centimeters> {
    override fun asType(d: Double) = Centimeters(d)
    override fun toMeters() = Meters(this.value * 0.01)
}

@JvmInline
value class Kilometers(override val value: Double) : UnitDistance<Kilometers> {
    override fun asType(d: Double) = Kilometers(d)
    override fun toMeters() = Meters(this.value * 1000.0)
}