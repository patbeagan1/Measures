package com.measures

import com.measures.americancustomary.distance.Foot
import com.measures.americancustomary.distance.Inch
import com.measures.americancustomary.distance.Mile
import com.measures.americancustomary.distance.Pica
import com.measures.americancustomary.distance.Point
import com.measures.americancustomary.distance.Yard
import com.measures.americancustomary.distance.nautical.Cable
import com.measures.americancustomary.distance.nautical.Fathom
import com.measures.americancustomary.distance.nautical.NauticalMile
import com.measures.americancustomary.distance.survey.Furlong
import com.measures.americancustomary.distance.survey.League
import com.measures.americancustomary.distance.survey.SurveyChain
import com.measures.americancustomary.distance.survey.SurveyFoot
import com.measures.americancustomary.distance.survey.SurveyLink
import com.measures.americancustomary.distance.survey.SurveyMile
import com.measures.americancustomary.distance.survey.SurveyRod
import com.measures.americancustomary.distance.toFoot
import com.measures.americancustomary.distance.toInch
import com.measures.americancustomary.distance.toMile
import com.measures.americancustomary.distance.toYard
import com.measures.americancustomary.volume.fluid.GallonUSAFluid
import com.measures.americancustomary.volume.fluid.OunceUSAFluid
import com.measures.americancustomary.volume.fluid.toGallonUSAFluid
import com.measures.area.SquareMeters
import com.measures.distance.Meters
import com.measures.metric.distance.Centimeter
import com.measures.metric.distance.Kilometer
import com.measures.metric.distance.asCentimeter
import com.measures.metric.distance.toKilometer
import com.measures.metric.distance.toMillimeter
import com.measures.metric.volume.Attoliter
import com.measures.metric.volume.Milliliter
import com.measures.metric.volume.toMilliliter
import com.measures.volume.Liters
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
        League(1.0).toKilometer().toMile()
    ).map { it to it }
    private val volumes = listOf(
        Liters(4.0).toMilliliter() + Milliliter(6.0),
        OunceUSAFluid(1.0).toOunceImperialFluid(),
        GallonUSAFluid(1.0).toLiters(),
        Attoliter(10000.0).toGallonUSAFluid(),
    ).map { it to it }
    private val other = listOf(
        Meters(2.0) * Meters(2.0),
        SquareMeters(4.0) / Meters(2.0),
        SquareMeters(4.0) * Meters(2.0),
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