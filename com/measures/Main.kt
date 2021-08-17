package com.example

import com.measures.area.SquareMeters
import com.measures.distance.Capefeet
import com.measures.distance.Centimeters
import com.measures.distance.Feet
import com.measures.distance.Inches
import com.measures.distance.Kilometers
import com.measures.distance.Meters
import com.measures.distance.Microns
import com.measures.distance.UnitDistance
import com.measures.distance.Yards
import com.measures.volume.Liters
import com.measures.volume.UnitVolume
import com.measures.volume.metric.Attoliter
import com.measures.volume.metric.Milliliter
import com.measures.volume.usacustomary.GallonUSAFluid
import com.measures.volume.usacustomary.OunceUSAFluid

val distances: List<UnitDistance<*>> = listOf(
    Meters(1.0) + Meters(2.0),
//    Meters(1.0) / Meters(2.0),
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
    Liters(4.0).toMilliliters() + Milliliter(6.0),
    OunceUSAFluid(1.0).toOunceImperialFluid(),
    GallonUSAFluid(1.0).toLiters(),
    Attoliter(10000.0).toGallonUSAFluid()
)

val other = listOf(
    Meters(2.0) * Meters(2.0),
    SquareMeters(4.0) / Meters(2.0),
    SquareMeters(4.0) * Meters(2.0),
)

fun main() {
    distances.forEachIndexed { index, it -> println("$index $it") }
    println()
    volumes.forEachIndexed { index, it -> println("$index $it") }
    println()
    other.forEachIndexed { index, it -> println("$index $it") }
}