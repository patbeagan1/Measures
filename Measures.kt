package com.example

interface DoubleBase<T> {
    val value: Double
    fun asType(d: Double): T
}

interface UnitTypedFull<S, T : DoubleBase<S>> : DoubleBase<T> {
    operator fun plus(other: T) = asType(this.value + other.value)
    operator fun div(other: T) = asType(this.value / other.value)
    operator fun times(other: T) = asType(this.value * other.value)
    operator fun minus(other: T) = asType(this.value - other.value)
}

//========================================================================

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
    fun toMilliliters() = toLiters().asMilliliters()
    fun toAcreFoot() = toLiters().asAcreFoot()
    fun toBarrelImperial() = toLiters().asBarrelImperial()
    fun toBarrelPetroleum() = toLiters().asBarrelPetroleum()
    fun toBarrelUSADry() = toLiters().asBarrelUSADry()
    fun toBarrelUSAFluid() = toLiters().asBarrelUSAFluid()
    fun toBushelImperial() = toLiters().asBushelImperial()
    fun toBushelUSA() = toLiters().asBushelUSA()
    fun toCordfirewood() = toLiters().asCordfirewood()
    fun toCubicFoot() = toLiters().asCubicFoot()
    fun toCubicInch() = toLiters().asCubicInch()
    fun toCubicCentimeter() = toLiters().asCubicCentimeter()
    fun toCubicMeter() = toLiters().asCubicMeter()
    fun toCubicMile() = toLiters().asCubicMile()
    fun toCubicYard() = toLiters().asCubicYard()
    fun toCupBreakfast() = toLiters().asCupBreakfast()
    fun toCupCanadian() = toLiters().asCupCanadian()
    fun toCupUSA() = toLiters().asCupUSA()
    fun toOunceImperialFluid() = toLiters().asOunceImperialFluid()
    fun toOunceUSAFluid() = toLiters().asOunceUSAFluid()
    fun toGallonImperial() = toLiters().asGallonImperial()
    fun toGallonUSADry() = toLiters().asGallonUSADry()
    fun toGallonUSAFluid() = toLiters().asGallonUSAFluid()
    fun toGillImperial() = toLiters().asGillImperial()
    fun toGillUSA() = toLiters().asGillUSA()
    fun toHogsheadImperial() = toLiters().asHogsheadImperial()
    fun toHogsheadUSA() = toLiters().asHogsheadUSA()
    fun toLiter() = toLiters().asLiter()
    fun toMilliliter() = toLiters().asMilliliter()
    fun toPeckImperial() = toLiters().asPeckImperial()
    fun toPeckUSADry() = toLiters().asPeckUSADry()
    fun toPintImperial() = toLiters().asPintImperial()
    fun toPintUSADry() = toLiters().asPintUSADry()
    fun toPintUSAFluid() = toLiters().asPintUSAFluid()
    fun toQuartImperial() = toLiters().asQuartImperial()
    fun toQuartUSADry() = toLiters().asQuartUSADry()
    fun toQuartUSAFluid() = toLiters().asQuartUSAFluid()
    fun toTablespoonCanadian() = toLiters().asTablespoonCanadian()
    fun toTablespoonImperial() = toLiters().asTablespoonImperial()
    fun toTablespoonUSA() = toLiters().asTablespoonUSA()
    fun toTeaspoonCanadian() = toLiters().asTeaspoonCanadian()
    fun toTeaspoonImperial() = toLiters().asTeaspoonImperial()
    fun toTeaspoonUSA() = toLiters().asTeaspoonUSA()
}

@JvmInline
value class Liters(override val value: Double) : UnitVolume<Liters> {
    override fun asType(d: Double) = Liters(d)
    override fun toLiters() = this
    private fun <R, T : UnitVolume<R>> toUnit(u: T) = u.asType((this / u.toLiters()).value)
    fun asMilliliters() = toUnit(Milliliters(1.0))
    fun asAcreFoot() = toUnit(AcreFoot(1.0))
    fun asBarrelImperial() = toUnit(BarrelImperial(1.0))
    fun asBarrelPetroleum() = toUnit(BarrelPetroleum(1.0))
    fun asBarrelUSADry() = toUnit(BarrelUSADry(1.0))
    fun asBarrelUSAFluid() = toUnit(BarrelUSAFluid(1.0))
    fun asBushelImperial() = toUnit(BushelImperial(1.0))
    fun asBushelUSA() = toUnit(BushelUSADry(1.0))
    fun asCordfirewood() = toUnit(Cordfirewood(1.0))
    fun asCubicFoot() = toUnit(CubicFoot(1.0))
    fun asCubicInch() = toUnit(CubicInch(1.0))
    fun asCubicCentimeter() = toUnit(CubicCentimeter(1.0))
    fun asCubicMeter() = toUnit(CubicMeter(1.0))
    fun asCubicMile() = toUnit(CubicMile(1.0))
    fun asCubicYard() = toUnit(CubicYard(1.0))
    fun asCupBreakfast() = toUnit(CupBreakfast(1.0))
    fun asCupCanadian() = toUnit(CupCanadian(1.0))
    fun asCupUSA() = toUnit(CupUSA(1.0))
    fun asOunceImperialFluid() = toUnit(OunceImperialFluid(1.0))
    fun asOunceUSAFluid() = toUnit(OunceUSAFluid(1.0))
    fun asGallonImperial() = toUnit(GallonImperial(1.0))
    fun asGallonUSADry() = toUnit(GallonUSADry(1.0))
    fun asGallonUSAFluid() = toUnit(GallonUSAFluid(1.0))
    fun asGillImperial() = toUnit(GillImperial(1.0))
    fun asGillUSA() = toUnit(GillUSA(1.0))
    fun asHogsheadImperial() = toUnit(HogsheadImperial(1.0))
    fun asHogsheadUSA() = toUnit(HogsheadUSA(1.0))
    fun asLiter() = toUnit(Liter(1.0))
    fun asMilliliter() = toUnit(Milliliter(1.0))
    fun asPeckImperial() = toUnit(PeckImperial(1.0))
    fun asPeckUSADry() = toUnit(PeckUSADry(1.0))
    fun asPintImperial() = toUnit(PintImperial(1.0))
    fun asPintUSADry() = toUnit(PintUSADry(1.0))
    fun asPintUSAFluid() = toUnit(PintUSAFluid(1.0))
    fun asQuartImperial() = toUnit(QuartImperial(1.0))
    fun asQuartUSADry() = toUnit(QuartUSADry(1.0))
    fun asQuartUSAFluid() = toUnit(QuartUSAFluid(1.0))
    fun asTablespoonCanadian() = toUnit(TablespoonCanadian(1.0))
    fun asTablespoonImperial() = toUnit(TablespoonImperial(1.0))
    fun asTablespoonUSA() = toUnit(TablespoonUSA(1.0))
    fun asTeaspoonCanadian() = toUnit(TeaspoonCanadian(1.0))
    fun asTeaspoonImperial() = toUnit(TeaspoonImperial(1.0))
    fun asTeaspoonUSA() = toUnit(TeaspoonUSA(1.0))
}

@JvmInline
value class Milliliters(override val value: Double) : UnitVolume<Milliliters> {
    override fun asType(d: Double) = Milliliters(d)
    override fun toLiters() = Liters(this.value * 0.001)
}

@JvmInline
value class AcreFoot(override val value: Double) : UnitVolume<AcreFoot> {
    override fun asType(d: Double) = AcreFoot(d)
    override fun toLiters() = Liters(value * 1233.481838 * 1000)
}

@JvmInline
value class BarrelImperial(override val value: Double) : UnitVolume<BarrelImperial> {
    override fun asType(d: Double) = BarrelImperial(d)
    override fun toLiters() = Liters(value * 0.16365924 * 1000)
}

@JvmInline
value class BarrelPetroleum(override val value: Double) : UnitVolume<BarrelPetroleum> {
    override fun asType(d: Double) = BarrelPetroleum(d)
    override fun toLiters() = Liters(value * 0.158987295 * 1000)
}

@JvmInline
value class BarrelUSADry(override val value: Double) : UnitVolume<BarrelUSADry> {
    override fun asType(d: Double) = BarrelUSADry(d)
    override fun toLiters() = Liters(value * 0.115628199 * 1000)
}

@JvmInline
value class BarrelUSAFluid(override val value: Double) : UnitVolume<BarrelUSAFluid> {
    override fun asType(d: Double) = BarrelUSAFluid(d)
    override fun toLiters() = Liters(value * 0.119240471 * 1000)
}

@JvmInline
value class BushelImperial(override val value: Double) : UnitVolume<BushelImperial> {
    override fun asType(d: Double) = BushelImperial(d)
    override fun toLiters() = Liters(value * 0.03636872 * 1000)
}

@JvmInline
value class BushelUSADry(override val value: Double) : UnitVolume<BushelUSADry> {
    override fun asType(d: Double) = BushelUSADry(d)
    override fun toLiters() = Liters(value * 0.03523907 * 1000)
}

@JvmInline
value class Cordfirewood(override val value: Double) : UnitVolume<Cordfirewood> {
    override fun asType(d: Double) = Cordfirewood(d)
    override fun toLiters() = Liters(value * 3.624556364 * 1000)
}

@JvmInline
value class CubicFoot(override val value: Double) : UnitVolume<CubicFoot> {
    override fun asType(d: Double) = CubicFoot(d)
    override fun toLiters() = Liters(value * 0.028316847 * 1000)
}

@JvmInline
value class CubicInch(override val value: Double) : UnitVolume<CubicInch> {
    override fun asType(d: Double) = CubicInch(d)
    override fun toLiters() = Liters(value * 1.63871E-05 * 1000)
}

@JvmInline
value class CubicCentimeter(override val value: Double) : UnitVolume<CubicCentimeter> {
    override fun asType(d: Double) = CubicCentimeter(d)
    override fun toLiters() = Liters(value * 0.000001 * 1000)
}

@JvmInline
value class CubicMeter(override val value: Double) : UnitVolume<CubicMeter> {
    override fun asType(d: Double) = CubicMeter(d)
    override fun toLiters() = Liters(value * 1 * 1000)
}

@JvmInline
value class CubicMile(override val value: Double) : UnitVolume<CubicMile> {
    override fun asType(d: Double) = CubicMile(d)
    override fun toLiters() = Liters(value * 4168181825 * 1000)
}

@JvmInline
value class CubicYard(override val value: Double) : UnitVolume<CubicYard> {
    override fun asType(d: Double) = CubicYard(d)
    override fun toLiters() = Liters(value * 0.764554858 * 1000)
}

@JvmInline
value class CupBreakfast(override val value: Double) : UnitVolume<CupBreakfast> {
    override fun asType(d: Double) = CupBreakfast(d)
    override fun toLiters() = Liters(value * 0.000284131 * 1000)
}

@JvmInline
value class CupCanadian(override val value: Double) : UnitVolume<CupCanadian> {
    override fun asType(d: Double) = CupCanadian(d)
    override fun toLiters() = Liters(value * 0.000227305 * 1000)
}

@JvmInline
value class CupUSA(override val value: Double) : UnitVolume<CupUSA> {
    override fun asType(d: Double) = CupUSA(d)
    override fun toLiters() = Liters(value * 0.000236588 * 1000)
}

@JvmInline
value class OunceImperialFluid(override val value: Double) : UnitVolume<OunceImperialFluid> {
    override fun asType(d: Double) = OunceImperialFluid(d)
    override fun toLiters() = Liters(value * 2.84131E-05 * 1000)
}

@JvmInline
value class OunceUSAFluid(override val value: Double) : UnitVolume<OunceUSAFluid> {
    override fun asType(d: Double) = OunceUSAFluid(d)
    override fun toLiters() = Liters(value * 2.95735E-05 * 1000)
}

@JvmInline
value class GallonImperial(override val value: Double) : UnitVolume<GallonImperial> {
    override fun asType(d: Double) = GallonImperial(d)
    override fun toLiters() = Liters(value * 0.00454609 * 1000)
}

@JvmInline
value class GallonUSADry(override val value: Double) : UnitVolume<GallonUSADry> {
    override fun asType(d: Double) = GallonUSADry(d)
    override fun toLiters() = Liters(value * 0.004404884 * 1000)
}

@JvmInline
value class GallonUSAFluid(override val value: Double) : UnitVolume<GallonUSAFluid> {
    override fun asType(d: Double) = GallonUSAFluid(d)
    override fun toLiters() = Liters(value * 0.003785412 * 1000)
}

@JvmInline
value class GillImperial(override val value: Double) : UnitVolume<GillImperial> {
    override fun asType(d: Double) = GillImperial(d)
    override fun toLiters() = Liters(value * 0.000142065 * 1000)
}

@JvmInline
value class GillUSA(override val value: Double) : UnitVolume<GillUSA> {
    override fun asType(d: Double) = GillUSA(d)
    override fun toLiters() = Liters(value * 0.000118294 * 1000)
}

@JvmInline
value class HogsheadImperial(override val value: Double) : UnitVolume<HogsheadImperial> {
    override fun asType(d: Double) = HogsheadImperial(d)
    override fun toLiters() = Liters(value * 0.32731848 * 1000)
}

@JvmInline
value class HogsheadUSA(override val value: Double) : UnitVolume<HogsheadUSA> {
    override fun asType(d: Double) = HogsheadUSA(d)
    override fun toLiters() = Liters(value * 0.238480942 * 1000)
}

@JvmInline
value class Liter(override val value: Double) : UnitVolume<Liter> {
    override fun asType(d: Double) = Liter(d)
    override fun toLiters() = Liters(value * 0.001 * 1000)
}

@JvmInline
value class Milliliter(override val value: Double) : UnitVolume<Milliliter> {
    override fun asType(d: Double) = Milliliter(d)
    override fun toLiters() = Liters(value * 0.000001 * 1000)
}

@JvmInline
value class PeckImperial(override val value: Double) : UnitVolume<PeckImperial> {
    override fun asType(d: Double) = PeckImperial(d)
    override fun toLiters() = Liters(value * 0.00909218 * 1000)
}

@JvmInline
value class PeckUSADry(override val value: Double) : UnitVolume<PeckUSADry> {
    override fun asType(d: Double) = PeckUSADry(d)
    override fun toLiters() = Liters(value * 0.008809768 * 1000)
}

@JvmInline
value class PintImperial(override val value: Double) : UnitVolume<PintImperial> {
    override fun asType(d: Double) = PintImperial(d)
    override fun toLiters() = Liters(value * 0.000568261 * 1000)
}

@JvmInline
value class PintUSADry(override val value: Double) : UnitVolume<PintUSADry> {
    override fun asType(d: Double) = PintUSADry(d)
    override fun toLiters() = Liters(value * 0.00055061 * 1000)
}

@JvmInline
value class PintUSAFluid(override val value: Double) : UnitVolume<PintUSAFluid> {
    override fun asType(d: Double) = PintUSAFluid(d)
    override fun toLiters() = Liters(value * 0.000473176 * 1000)
}

@JvmInline
value class QuartImperial(override val value: Double) : UnitVolume<QuartImperial> {
    override fun asType(d: Double) = QuartImperial(d)
    override fun toLiters() = Liters(value * 0.001136523 * 1000)
}

@JvmInline
value class QuartUSADry(override val value: Double) : UnitVolume<QuartUSADry> {
    override fun asType(d: Double) = QuartUSADry(d)
    override fun toLiters() = Liters(value * 0.001101221 * 1000)
}

@JvmInline
value class QuartUSAFluid(override val value: Double) : UnitVolume<QuartUSAFluid> {
    override fun asType(d: Double) = QuartUSAFluid(d)
    override fun toLiters() = Liters(value * 0.000946353 * 1000)
}

@JvmInline
value class TablespoonCanadian(override val value: Double) : UnitVolume<TablespoonCanadian> {
    override fun asType(d: Double) = TablespoonCanadian(d)
    override fun toLiters() = Liters(value * 1.42065E-05 * 1000)
}

@JvmInline
value class TablespoonImperial(override val value: Double) : UnitVolume<TablespoonImperial> {
    override fun asType(d: Double) = TablespoonImperial(d)
    override fun toLiters() = Liters(value * 1.77582E-05 * 1000)
}

@JvmInline
value class TablespoonUSA(override val value: Double) : UnitVolume<TablespoonUSA> {
    override fun asType(d: Double) = TablespoonUSA(d)
    override fun toLiters() = Liters(value * 1.47868E-05 * 1000)
}

@JvmInline
value class TeaspoonCanadian(override val value: Double) : UnitVolume<TeaspoonCanadian> {
    override fun asType(d: Double) = TeaspoonCanadian(d)
    override fun toLiters() = Liters(value * 4.73551E-06 * 1000)
}

@JvmInline
value class TeaspoonImperial(override val value: Double) : UnitVolume<TeaspoonImperial> {
    override fun asType(d: Double) = TeaspoonImperial(d)
    override fun toLiters() = Liters(value * 5.91939E-06 * 1000)
}

@JvmInline
value class TeaspoonUSA(override val value: Double) : UnitVolume<TeaspoonUSA> {
    override fun asType(d: Double) = TeaspoonUSA(d)
    override fun toLiters() = Liters(value * 4.92892E-06 * 1000)
}


//========================================================================

typealias UnitDistance<T> = UnitDistanceTypedFull<T, T>

interface UnitDistanceTypedFull<S, T : DoubleBase<S>> : UnitTypedFull<S, T> {
    operator fun plus(other: UnitDistanceTypedFull<*, *>) =
        Meters(this.toMeters().value + other.toMeters().value)

    operator fun minus(other: UnitDistanceTypedFull<*, *>) =
        Meters(this.toMeters().value - other.toMeters().value)

    operator fun div(other: UnitDistanceTypedFull<*, *>) =
        Meters(this.toMeters().value / other.toMeters().value)

    operator fun times(other: UnitDistanceTypedFull<*, *>) =
        Meters(this.toMeters().value * other.toMeters().value)

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
    private fun <R, T : UnitDistance<R>> toUnit(u: T) = u.asType((this / u.toMeters()).value)
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

val distances: List<UnitDistance<*>> = listOf(
    Meters(1.0) + Meters(2.0),
    Meters(1.0) / Meters(2.0),
    Kilometers(3.0).toMeters().toInches(),
    Centimeters(200.0) - Centimeters(1.0),
    Kilometers(1.0) + Meters(1.0),
    (Kilometers(1.0) + Meters(1.0)).toKilometers(),
    Meters(2.5).asCentimeters(),
    Inches(4.0).toMeters().toInches(),
    Centimeters(4.0).toInches(),
    Inches(400.0).toMeters().toKilometers(),
    Feet(1.0).toInches(),
    Feet(3.0).toYards(),
    Yards(1.0).toCapefeet(),
    (Capefeet(2.0) + Meters(6.0) - Inches(5.0)).toFeet(),
    Microns(20.0).toMillimeters()
)
val volumes: List<UnitVolume<*>> = listOf(
    Liters(4.0).toMilliliters() + Milliliters(6.0),
    OunceUSAFluid(1.0).toOunceImperialFluid(),
    GallonUSAFluid(1.0).toLiter()
)

fun main() {
    distances.forEachIndexed { index, it -> println("$index $it") }
    println()
    volumes.forEachIndexed { index, it -> println("$index $it") }
}
