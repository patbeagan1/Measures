package com.measures.volume

import com.measures.DoubleBase
import com.measures.UnitTypedFull
import com.measures.volume.canadian.CupCanadian
import com.measures.volume.canadian.TablespoonCanadian
import com.measures.volume.canadian.TeaspoonCanadian
import com.measures.volume.cubic.CubicCentimeter
import com.measures.volume.cubic.CubicFoot
import com.measures.volume.cubic.CubicInch
import com.measures.volume.cubic.CubicMeter
import com.measures.volume.cubic.CubicMile
import com.measures.volume.cubic.CubicYard
import com.measures.volume.imperial.BarrelImperial
import com.measures.volume.imperial.BushelImperial
import com.measures.volume.imperial.GallonImperial
import com.measures.volume.imperial.GillImperial
import com.measures.volume.imperial.HogsheadImperial
import com.measures.volume.imperial.OunceImperialFluid
import com.measures.volume.imperial.PeckImperial
import com.measures.volume.imperial.PintImperial
import com.measures.volume.imperial.QuartImperial
import com.measures.volume.imperial.TablespoonImperial
import com.measures.volume.imperial.TeaspoonImperial
import com.measures.volume.metric.Milliliter
import com.measures.volume.other.AcreFoot
import com.measures.volume.other.BarrelPetroleum
import com.measures.volume.other.CordFirewood
import com.measures.volume.other.CupBreakfast
import com.measures.volume.usacustomary.BarrelUSADry
import com.measures.volume.usacustomary.BarrelUSAFluid
import com.measures.volume.usacustomary.BushelUSADry
import com.measures.volume.usacustomary.CupUSA
import com.measures.volume.usacustomary.GallonUSADry
import com.measures.volume.usacustomary.GallonUSAFluid
import com.measures.volume.usacustomary.GillUSA
import com.measures.volume.usacustomary.HogsheadUSA
import com.measures.volume.usacustomary.OunceUSAFluid
import com.measures.volume.usacustomary.PeckUSADry
import com.measures.volume.usacustomary.PintUSADry
import com.measures.volume.usacustomary.PintUSAFluid
import com.measures.volume.usacustomary.QuartUSADry
import com.measures.volume.usacustomary.QuartUSAFluid
import com.measures.volume.usacustomary.TablespoonUSA
import com.measures.volume.usacustomary.TeaspoonUSA

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
    fun asMilliliters() = toUnit(Milliliter(1.0))
    fun asAcreFoot() = toUnit(AcreFoot(1.0))
    fun asBarrelImperial() = toUnit(BarrelImperial(1.0))
    fun asBarrelPetroleum() = toUnit(BarrelPetroleum(1.0))
    fun asBarrelUSADry() = toUnit(BarrelUSADry(1.0))
    fun asBarrelUSAFluid() = toUnit(BarrelUSAFluid(1.0))
    fun asBushelImperial() = toUnit(BushelImperial(1.0))
    fun asBushelUSA() = toUnit(BushelUSADry(1.0))
    fun asCordfirewood() = toUnit(CordFirewood(1.0))
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


