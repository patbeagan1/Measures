package com.measures

import com.measures.area.SquareMeters
import com.measures.distance.Furlong
import com.measures.distance.League
import com.measures.distance.Meters
import com.measures.distance.SurveyChain
import com.measures.distance.SurveyFoot
import com.measures.distance.SurveyLink
import com.measures.distance.SurveyMile
import com.measures.distance.SurveyRod
import com.measures.englishinternational.distance.Foot
import com.measures.englishinternational.distance.Inch
import com.measures.englishinternational.distance.Mile
import com.measures.englishinternational.distance.Pica
import com.measures.englishinternational.distance.Point
import com.measures.englishinternational.distance.Yard
import com.measures.englishinternational.distance.nautical.Cable
import com.measures.englishinternational.distance.nautical.Fathom
import com.measures.englishinternational.distance.nautical.NauticalMile
import com.measures.englishinternational.distance.toFoot
import com.measures.englishinternational.distance.toInch
import com.measures.englishinternational.distance.toMile
import com.measures.englishinternational.distance.toYard
import com.measures.metric.distance.Centimeter
import com.measures.metric.distance.Kilometer
import com.measures.metric.distance.asCentimeter
import com.measures.metric.distance.toKilometer
import com.measures.metric.distance.toMillimeter
import com.measures.metric.volume.Attoliter
import com.measures.metric.volume.Milliliter
import com.measures.metric.volume.toMegaliter
import com.measures.metric.volume.toMilliliter
import com.measures.volume.Liters
import com.measures.volume.fluid.USFluidGallon
import com.measures.volume.fluid.USFluidOunce
import com.measures.volume.fluid.toUSFluidGallon
import com.measures.volume.toOunceImperialFluid

class Main {
    private val distances = listOf(
        Meters(1.0) + Meters(2.0),
//    Meters(1.0) / Meters(2.0),
        Kilometer(3.0).toMeters().toInch(),
        Centimeter(200.0) - Centimeter(1.0),
        Kilometer(1.0) + Meters(1.0),
        (Kilometer(1.0) + Meters(1.0)).toKilometer(),
        Meters(2.5).asCentimeter(),
        Inch(4.0).toMeters().toInch(),
        Centimeter(4.0).toInch(),
        Centimeter(2.54).toInch(),
        Inch(400.0).toMeters().toKilometer(),
        Foot(1.0).toInch(),
        Foot(3.0).toYard(),
        (SquareMeters(1.0) / Foot(1.0)).toYard(),
        Yard(1.0).toCapefeet(),
        (Capefeet(2.0) + Meters(6.0) - Inch(5.0)).toFoot(),
        Microns(20.0).toMillimeter(),
        SurveyMile(1.0).toMile(),
        League(1.0).toMile()
    ).map { it to it }
    private val volumes = listOf(
        Liters(4.0).toMilliliter() + Milliliter(6.0),
        USFluidOunce(1.0).toOunceImperialFluid(),
        USFluidGallon(1.0).toLiters(),
        Attoliter(10000.0).toUSFluidGallon(),
    ).map { it to it }
    private val other = listOf(
        Meters(2.0) * Meters(2.0),
        SquareMeters(4.0) / Meters(2.0),
        SquareMeters(4.0) * Meters(2.0),
        (Furlong(1.0) *Furlong(1.0) *Furlong(1.0) ).toMegaliter()
    ).map { it to it }

    fun run() {
        distances.printNumbered()
        volumes.printNumbered()
        other.printNumbered()

        listOf(
            Point(1.0),
            Pica(1.0),
            Inch(1.0),
            Foot(1.0),
            Yard(1.0),
            Mile(1.0),
            SurveyLink(1.0),
            SurveyFoot(1.0),
            SurveyRod(1.0),
            SurveyChain(1.0),
            Furlong(1.0),
            SurveyMile(1.0),
            League(1.0),
            Fathom(1.0),
            Cable(1.0),
            NauticalMile(1.0),
        ).map {
            it to it.toMeters()
        }.printNumbered()
    }

    private fun List<Pair<UnitTypedFull<*, *>, UnitTypedFull<*, *>>>.printNumbered() {
        forEachIndexed { index, it ->
            println("$index\t${it.first::class.java.simpleName}\t${it.second}")
        }
        println()
    }
}