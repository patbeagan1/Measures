package com.measures

import com.measures.area.SquareMeters
import com.measures.distance.Meters
import com.measures.distance.SurveyChain
import com.measures.distance.SurveyFoot
import com.measures.distance.SurveyFurlong
import com.measures.distance.SurveyLeague
import com.measures.distance.SurveyLink
import com.measures.distance.SurveyMile
import com.measures.distance.SurveyRod
import com.measures.international.distance.InternationalFoot
import com.measures.international.distance.InternationalInch
import com.measures.international.distance.InternationalMile
import com.measures.international.distance.InternationalPica
import com.measures.international.distance.InternationalPoint
import com.measures.international.distance.InternationalYard
import com.measures.international.distance.nautical.InternationalCable
import com.measures.international.distance.nautical.InternationalFathom
import com.measures.international.distance.nautical.InternationalNauticalMile
import com.measures.international.distance.toInternationalFoot
import com.measures.international.distance.toInternationalInch
import com.measures.international.distance.toInternationalMile
import com.measures.international.distance.toInternationalYard
import com.measures.metric.distance.Centimeter
import com.measures.metric.distance.Kilometer
import com.measures.metric.distance.toKilometer
import com.measures.metric.distance.toMillimeter
import com.measures.metric.volume.Attoliter
import com.measures.metric.volume.Milliliter
import com.measures.metric.volume.toMegaliter
import com.measures.metric.volume.toMilliliter
import com.measures.other.Capefeet
import com.measures.other.Microns
import com.measures.other.toCapefeet
import com.measures.volume.Liter
import com.measures.volume.fluid.USFluidGallon
import com.measures.volume.fluid.USFluidOunce
import com.measures.volume.fluid.toUSFluidGallon
import com.measures.volume.toImperialFluidOunce

class Runtime {
    private val distances = listOf(
        Meters(1.0) + Meters(2.0),
//    Meters(1.0) / Meters(2.0),
        Kilometer(3.0).toMeters().toInternationalInch(),
        Centimeter(200.0) - Centimeter(1.0),
        Kilometer(1.0) + Meters(1.0),
        (Kilometer(1.0) + Meters(1.0)).toKilometer(),
        Meters(2.5).toUnit(Centimeter(1.0)),
        InternationalInch(4.0).toMeters().toInternationalInch(),
        Centimeter(4.0).toInternationalInch(),
        Centimeter(2.54).toInternationalInch(),
        InternationalInch(400.0).toMeters().toKilometer(),
        InternationalFoot(1.0).toInternationalInch(),
        InternationalFoot(3.0).toInternationalYard(),
        (SquareMeters(1.0) / InternationalFoot(1.0)).toInternationalYard(),
        InternationalYard(1.0).toCapefeet(),
        (Capefeet(2.0) + Meters(6.0) - InternationalInch(5.0)).toInternationalFoot(),
        Microns(20.0).toMillimeter(),
        SurveyMile(1.0).toInternationalMile(),
        SurveyLeague(1.0).toInternationalMile()
    ).map { it to it }
    private val volumes = listOf(
        Liter(4.0).toMilliliter() + Milliliter(6.0),
        USFluidOunce(1.0).toImperialFluidOunce(),
        USFluidGallon(1.0).toLiters(),
        Attoliter(10000.0).toUSFluidGallon(),
    ).map { it to it }
    private val other = listOf(
        Meters(2.0) * Meters(2.0),
        SquareMeters(4.0) / Meters(2.0),
        SquareMeters(4.0) * Meters(2.0),
        (SurveyFurlong(1.0) * SurveyFurlong(1.0) * SurveyFurlong(1.0)).toMegaliter()
    ).map { it to it }

    fun run() {
        distances.printNumbered()
        volumes.printNumbered()
        other.printNumbered()

        listOf(
            InternationalPoint(1.0),
            InternationalPica(1.0),
            InternationalInch(1.0),
            InternationalFoot(1.0),
            InternationalYard(1.0),
            InternationalMile(1.0),
            SurveyLink(1.0),
            SurveyFoot(1.0),
            SurveyRod(1.0),
            SurveyChain(1.0),
            SurveyFurlong(1.0),
            SurveyMile(1.0),
            SurveyLeague(1.0),
            InternationalFathom(1.0),
            InternationalCable(1.0),
            InternationalNauticalMile(1.0),
        ).map {
            it to it.toMeters()
        }.sortedBy {
            it.second.value
        }.printNumbered()
    }

    private fun List<Pair<UnitTypedFull<*, *>, UnitTypedFull<*, *>>>.printNumbered() {
        forEachIndexed { index, it ->
            println("$index\t${it.first::class.java.simpleName}\t${it.second}")
        }
        println()
    }
}